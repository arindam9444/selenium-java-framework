package com.TestCases;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_Request
{
@Test	
void regtrationSucessfull()
{
	//url launcher
	RestAssured.baseURI="https://reqres.in/api/users";
	
	RequestSpecification httpRequest=RestAssured.given();
	
	//request payload
	JSONObject requestParams=new JSONObject();	
	requestParams.put("name", "morpheus");
	requestParams.put("job", "leader");
	
	
	httpRequest.header("Content-Type","application/json");
	httpRequest.body(requestParams.toJSONString());
	
	//response object
	 Response responce=httpRequest.request(Method.POST);
	 
	 String responseBody=responce.getBody().asString();
	 System.out.println("Response body is: "+ responseBody);
	 
	 int statusCode=responce.getStatusCode();
	 System.out.println("response code is:"+ statusCode);
	 Assert.assertEquals(statusCode, 201);
	 
	 String sucessCode=responce.jsonPath().get("StatusCode");
	 System.out.println("sucessCode is:"+ sucessCode);
	 //Assert.assertEquals(sucessCode, "PASS");
	
}

}
