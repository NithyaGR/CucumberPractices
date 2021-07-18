package com.gorest.testCases;

import org.testng.annotations.Test;

import com.gorest.client.RestClient;
import com.gorest.pojo.Users;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostAPIs {
	
	String baseURI = "https://gorest.co.in";//https://gorest.co.in/public-api/users
	String basePath = "/public-api/users";
	String token = "f8927c67c5f0286e676b0ccedd17693d636a3b483fe2753ee19f81a601fa9708";
	
	@Test
	public void createUserAPI(){
		
		Users user = new Users("Nithya", "NithyaTest@Test.com", "Female", "active");
		Response response = RestClient.doPost("JSON", baseURI, basePath, token, true, user);
		System.out.println(RestClient.getStatusCode(response));
		JsonPath jsonPath = RestClient.getJasonPAth(response);
		System.out.println(jsonPath.get("code"));
		RestClient.getPrettyPrint(response);
		
		
		
		
	}

}
