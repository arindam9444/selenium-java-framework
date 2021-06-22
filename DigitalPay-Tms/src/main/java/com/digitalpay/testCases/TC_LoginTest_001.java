package com.digitalpay.testCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import com.digitalpay.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	
@Test
public void login() throws Exception
{

	System.out.println("Second Part");
	System.out.println(driver.getTitle());
	
	if(driver.getTitle().equals("System Dashboard"))
	{

		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}
	
	
}


}
