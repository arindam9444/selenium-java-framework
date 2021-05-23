package com.TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC004_GET_Request
{
@Test
public void singleResource()
{
	  //set url
	  RestAssured.baseURI="https://reqres.in/api/unknown/2";
	  
	  RequestSpecification httpRequest= RestAssured.given();
	  
	  Response responce=httpRequest.request(Method.GET);
	  
	 String responceBody=responce.getBody().asString();
	 System.out.println("responceBody is:"+ responceBody);
	  
	  int statusCode=responce.getStatusCode();
	  System.out.println("Responce code is:"+ statusCode);
	  Assert.assertEquals(statusCode, 200);
	  
	  
	  
	  
	  
	  
}
}
