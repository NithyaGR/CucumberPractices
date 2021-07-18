package com.ra.postCalls;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCall {
	
	@Test
	public void generateToken(){
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";//https://restful-booker.herokuapp.com/auth
		RequestSpecification request = RestAssured.given().log().all();
		String body = "{\"username\": \"admin\",\"password\": \"password123\"}";
		request.contentType("application/json");
		Response response = request.post("/auth");
		System.out.println(response.prettyPrint());
		JsonPath jsonPath = response.jsonPath();
		System.out.println(jsonPath.get("token"));
		System.out.println("Generated Token is: "+jsonPath.get("token"));
		System.out.println(body);
		//Assert.assertNotNull(jsonPath.get("token"));
		
		
		//"token": "3ba1f66ec46d344"
	}

}
