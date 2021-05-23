package com.TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_GET_Request
{
@Test
void userNotFound() 
{
	//url set
	RestAssured.baseURI="https://reqres.in/api/users/23";
	
	RequestSpecification httpRequest= RestAssured.given();
	
	Response responce=httpRequest.request(Method.GET);
	
	String responceBody=responce.getBody().asString();
	System.out.println("ResponceBody is :"+ responceBody);
			
	int responceCode=responce.getStatusCode();
	System.out.println("ResponceCode is:"+ responceCode);
	Assert.assertEquals(responceCode, 404);
	

}
}
