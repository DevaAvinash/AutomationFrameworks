package org.test.automation.API.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;



@Test
public class APITest
{
	public void WeatherMessageBody()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/Hyderabad");
 
		ResponseBody body = response.getBody();
 
		System.out.println("Response Body is: " + body.asString());
}
}
