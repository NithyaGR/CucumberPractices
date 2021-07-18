package com.ra.getCalls;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetCallNonBDD {
	
	@Test (enabled = false)
	public void getAllUser(){
		
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request = RestAssured.given().log().all();
		request.header("Authorization", "Bearer f8927c67c5f0286e676b0ccedd17693d636a3b483fe2753ee19f81a601fa9708");
		request.contentType("application/json");
		Response response = request.get("/public-api/users");
		System.out.println(response.getBody().asString());
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
		String serverValue = response.getHeader("Server");
		System.out.println(serverValue);
	}
	
	@Test
	public void getUserWithParam(){
		
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request = RestAssured.given().log().all();
		request.header("Authorization", "Bearer f8927c67c5f0286e676b0ccedd17693d636a3b483fe2753ee19f81a601fa9708");
		request.contentType("application/json");
		request.queryParam("status","Active");
		request.queryParam("gender","Female");
		Response response = request.get("/public-api/users");
		System.out.println(response.prettyPrint());
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
		String serverValue = response.getHeader("Server");
		System.out.println(serverValue);
	}

}
