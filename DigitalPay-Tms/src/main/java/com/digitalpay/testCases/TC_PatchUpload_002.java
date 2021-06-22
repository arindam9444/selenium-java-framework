package com.digitalpay.testCases;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.digitalpay.pageObjects.LoginPage;
import com.digitalpay.pageObjects.PatchUpload;


public class TC_PatchUpload_002 extends BaseClass
{

	
@Test
public void upload() throws Exception
{
	
	PatchUpload pu=new PatchUpload(driver);
	Thread.sleep(5000);
	pu.Tmstab();
	pu.patchupload();
	Thread.sleep(5000);
    //selectByValue(pu.filetype(), "1001");
    pu.add();
    Thread.sleep(2000);
    selectByValue(pu.filetypeo(), "1001");
	pu.filename();
Runtime.getRuntime().exec("C:\\Users\\WorldBrand\\Desktop\\n910 build\\FileUploadScript.exe");
Thread.sleep(5000);
pu.save();
Thread.sleep(10000);
captureScreen(driver,"FileUpload");


}

}
