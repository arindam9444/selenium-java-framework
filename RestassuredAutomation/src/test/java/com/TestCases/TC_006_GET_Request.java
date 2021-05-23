package com.TestCases;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_006_GET_Request
{
@Test
public void googleMapTest()
{
	   RestAssured.baseURI="https://maps.googleapis.com//maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyBjGCE3VpLU4lgTqSTDmHmJ2HoELb4Jy1s";
	   RequestSpecification httpRequest=RestAssured.given();
	   
	   Response responce=httpRequest.request(Method.GET);
	   
	   String responseBody=responce.getBody().asString();
	   System.out.println("Response Body is: "+ responseBody);
	   
	   /*String contentType=responce.header("Content-Type");
	   System.out.println("ContentType is:"+contentType);
	   
	   String DATE=responce.header("Date");
	   System.out.println("ContentType is:"+DATE);*/
	   
	   Headers allHeader= responce.headers();
	   for(Header header:allHeader)
	   {
		   System.out.println(header.getName());
		   System.out.println(header.getValue());
		   
	   }
	   
	   
}
	
	
}
