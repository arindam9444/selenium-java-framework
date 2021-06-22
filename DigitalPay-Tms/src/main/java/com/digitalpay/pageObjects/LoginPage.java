package com.digitalpay.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	WebDriver ldriver;

public LoginPage(WebDriver rdriver)
{
	 ldriver=rdriver;
	 PageFactory.initElements(rdriver, this);
}

 @FindBy(id="j_username")
 WebElement txtUserName;
  
@FindBy(id="j_password")
WebElement txtPassword;

@FindBy(xpath="//input[@class=\"loginButton\"]")
WebElement loginButton;

@FindBy(xpath="//a[text()='TMS']")
WebElement TmsTab;

public void setUserName(String uname)
{
	txtUserName.sendKeys(uname);
}

public void setPassword(String pwd)
{
	txtPassword.sendKeys(pwd);
}
public void clickSubmit()
{
	loginButton.click();
}
public void Tmstab()
{
	TmsTab.click();
}

}
