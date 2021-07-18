package com.ra.pojo;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GenerateTokenPojo {
	
	@Test
	public void generateTokenByPOJO() throws JsonProcessingException{
		
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		RequestSpecification request = RestAssured.given().log().all();
		Credentials cred = new Credentials("admin","password123");
		ObjectMapper mapper = new ObjectMapper();
		String payLoad = mapper.writeValueAsString(cred);
		System.out.println(payLoad);
		request.contentType("application/json");
		Response response = request.post("/auth");
		System.out.println(response.prettyPrint());
		JsonPath jsonPath = response.jsonPath();
		System.out.println("Generated Token is: "+jsonPath.get("token"));
		System.out.println();
		
		
		
		
		
		
	}
	

}
