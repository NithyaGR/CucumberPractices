package com.gorest.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gorest.client.RestClient;
import com.gorest.common.Constants;

import io.restassured.response.Response;

public class GetAPIs {

	String baseURI = "https://gorest.co.in";//https://gorest.co.in/public-api/users
	String basePath = "/public-api/users";
	String token = "f8927c67c5f0286e676b0ccedd17693d636a3b483fe2753ee19f81a601fa9708";
	
	@Test
	public void getAllUsersAPI(){
		
		Response response = RestClient.doGet("JSON", baseURI, basePath, token, true);
		System.out.println(RestClient.getStatusCode(response));
		Assert.assertEquals(RestClient.getStatusCode(response), Constants.HTTP_statusCode_200);
	}
}
