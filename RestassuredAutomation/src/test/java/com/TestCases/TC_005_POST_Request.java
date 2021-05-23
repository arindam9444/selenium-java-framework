package com.TestCases;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_005_POST_Request 
{

@Test
public void regsterSucessfull()
{
 
	RestAssured.baseURI="https://reqres.in/api/register";
	
	RequestSpecification httpRequest=RestAssured.given();
	
    JSONObject requestParams=new JSONObject();
    requestParams.put("email","eve.holt@reqres.in");
    requestParams.put("password","pistol");
    
    httpRequest.header("Content-Type","Application/Json");
    httpRequest.body(requestParams.toJSONString());  
    
   Response responce=httpRequest.request(Method.POST);
   
   String responceBody=responce.getBody().asString();
   System.out.println("Responce body is:"+ responceBody);
   
   int responseCode=responce.getStatusCode();
   System.out.println("Responce Code is:"+ responseCode);
   Assert.assertEquals(responseCode, 200);
   
   int Id=responce.jsonPath().get("id");
   System.out.println("ID is:"+ Id);
   
   String tokena=responce.jsonPath().get("token");
   System.out.println("Token is :"+tokena);
   
   
  
}

}