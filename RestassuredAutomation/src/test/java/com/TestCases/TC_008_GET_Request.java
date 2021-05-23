package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_008_GET_Request
{

@Test
public void m1()
{
	//Base URL
	RestAssured.baseURI="https://reqres.in/api/unknown/2";
	 
	//RequestObject
	RequestSpecification httprequest=RestAssured.given();
	
	//ResponseObject
	Response responce=httprequest.request(Method.GET);
	JsonPath path=responce.jsonPath();
	
	 
	String responsebody=responce.getBody().asString();
	System.out.println(responsebody);
	
	int responceCode=responce.getStatusCode();
	System.out.println(responceCode);
	Assert.assertEquals(responceCode,200);
	
  Assert.assertEquals(responsebody.contains("color"), true);
 int len=responsebody.length();
  System.out.println("length is"+len);
  
  String Name=path.get("name");
  System.out.println("Name is:"+Name);
  
	
	
	
	
}
}
