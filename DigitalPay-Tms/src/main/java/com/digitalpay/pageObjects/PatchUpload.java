package com.digitalpay.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PatchUpload 
{

	WebDriver ldriver;

public PatchUpload(WebDriver rdriver)
{
	 ldriver=rdriver;
	 PageFactory.initElements(rdriver, this);
}

@FindBy(xpath="//a[text()='TMS']")
WebElement TmsTab;

@FindBy(xpath="//a[contains(text(),'Patch Upload')]")
WebElement patchUpload;

@FindBy(id="file_type_id")
WebElement fileType;

@FindBy(id="filetypeid")
WebElement filetyype;


@FindBy(xpath="//button[contains(text(),'Add')]")
WebElement Add;

@FindBy(name="file_name")
WebElement fileName;

@FindBy(xpath="//button[contains(text(),'Save')]")
WebElement Save;

public void Tmstab()
{
	TmsTab.click();
}

public void patchupload()
{
	patchUpload.click();
}
public WebElement filetype()
{
  fileType.click();
return fileType;
}
public void add()
{
	Add.click();
}
public WebElement filetypeo()
{
	filetyype.click();
return filetyype;
}

public void filename()
{
	fileName.click();
}

public void save()
{
	Save.click();
}
}
