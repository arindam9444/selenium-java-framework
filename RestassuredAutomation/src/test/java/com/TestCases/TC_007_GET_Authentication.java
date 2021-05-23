package com.TestCases;
import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;

public class TC_007_GET_Authentication
{

public void Authorization()
{
	RestAssured.baseURI="https://www.youtube.com/watch?v=n3UITFRJ9KU&list=PLUDwpEzHYYLskkglxoXd0L6DKu4uOfh-m&index=1";
	
	PreemptiveBasicAuthScheme abcd=new PreemptiveBasicAuthScheme();
	abcd.setUserName("aman");
	abcd.setPassword("chala chal"); 
	
	RestAssured.authentication=abcd;
	
}
}
