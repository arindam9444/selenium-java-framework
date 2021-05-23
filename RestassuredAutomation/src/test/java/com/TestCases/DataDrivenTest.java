package com.TestCases;
import org.testng.annotations.Test;

import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataDrivenTest extends ExcelDataExtractor
{

@Test(dataProvider="empdataProvider")
void postNewEmployee(String ename, String ejob)
{
	RestAssured.baseURI="https://reqres.in/api/users";
	
	RequestSpecification httpRequest=RestAssured.given();
	
	JSONObject requestParams=new JSONObject();
	requestParams.put("name",ename);
	requestParams.put("job", ejob);
	

httpRequest.header("Content-Type","Application/Json");
httpRequest.body(requestParams.toJSONString());

Response response=httpRequest.request(Method.POST);
String responseBody=response.getBody().asString();
System.out.println("response body is:"+ responseBody);





}
		
}



