package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_003 extends BaseClass
{

@Test
public void addCustomer ()
{
    LoginPage lp=new LoginPage(driver);
   lp.setUserName(username);
   logger.info("user name entered");
   lp.setPassword(password);
   lp.clickLogout();
   
   
   
   
   
} 

}
