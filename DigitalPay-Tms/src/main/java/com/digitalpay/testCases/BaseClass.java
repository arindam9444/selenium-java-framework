package com.digitalpay.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.digitalpay.pageObjects.LoginPage;
import com.digitalpay.utilities.ReadConfig;



public class BaseClass
{
	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String UserName=readconfig.getUsername();
	public String Password=readconfig.getPassword();
	public WebDriver driver;
	
@BeforeClass
public void setup()
{
	
	System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(baseURL);
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(UserName);
	lp.setPassword(Password);
	lp.clickSubmit();
	System.out.println("login complete");

}

/*@AfterClass
public void quit()
{
	driver.quit();
}*/
   
public void verifyDropdownValue(WebElement element) throws InterruptedException {
	int x = 0;
	Thread.sleep(1000);
	while (x < 3) {
		if (element.findElements(By.tagName("option")).size() > 0) {
			break;
		} else {
			Thread.sleep(1000);
			x++;
		}
	}

}

public <T> void selectByValue(WebElement element, T value) throws InterruptedException
{
	try {
		verifyDropdownValue(element);
		if (value != null && element.isDisplayed()) {
			new Select(element).selectByValue(value.toString());
		} else {
			new Select(element).selectByIndex(0);
		}
	} catch (StaleElementReferenceException s) {
		driver.navigate().refresh();
		Thread.sleep(2000);
		if (value != null && element.isDisplayed()) {
			new Select(element).selectByValue(value.toString());
		} else {
			new Select(element).selectByIndex(0);
		}
	}}

public void captureScreen(WebDriver driver, String tname) throws IOException
{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
}

}	


