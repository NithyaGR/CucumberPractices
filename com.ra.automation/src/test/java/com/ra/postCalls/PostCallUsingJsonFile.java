package com.ra.postCalls;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCallUsingJsonFile {
	
	@Test
	public void usingJsonFileToPost(){
		
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request = RestAssured.given().log().all();
		request.contentType("application/json");
		request.header("Authorization", "Bearer f8927c67c5f0286e676b0ccedd17693d636a3b483fe2753ee19f81a601fa9708");
		File payLoad = new File("./src/test/resources/jsonFile/CreateUser.json");
		request.body(payLoad);
		Response response = request.post("/public-api/users");
		System.out.println(response.prettyPrint());
		JsonPath jsonPath = response.jsonPath();
		Object user = jsonPath.get("data.name");
		System.out.println(user);
		
		//f8927c67c5f0286e676b0ccedd17693d636a3b483fe2753ee19f81a601fa9708
		
	}
	
	

}
