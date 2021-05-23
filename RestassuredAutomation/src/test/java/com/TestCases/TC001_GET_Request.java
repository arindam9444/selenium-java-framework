package com.TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request
{
@Test
void getweatherDetails() 
{
	RestAssured.baseURI="https://reqres.in/api/users/2";
	 RequestSpecification httpRequest=RestAssured.given();
	 Response responce=httpRequest.request(Method.GET);
	 String responseBody=responce.getBody().asString();
	 System.out.println("Response body is: "+ responseBody);
	 int statusCode=responce.getStatusCode();
	 System.out.println("response code is:"+ statusCode);
	 Assert.assertEquals(statusCode, 200);
	  String statusLine=responce.getStatusLine();
	  System.out.println("status line is:"+ statusLine);  
	 Assert.assertEquals(responseBody.contains("email"), true);
	 
	 String Email=responce.jsonPath().get("email");
	 System.out.println("Email is:"+Email);
	 
	 JsonPath jsonPath=responce.jsonPath();
	 System.out.println(jsonPath.get("email"));
	 System.out.println(jsonPath.get("first_name"));
	 
	 
	  
	  
	  
	
	 
	
	 
	 
	 
	 
	 
}

}
