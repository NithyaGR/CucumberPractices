package com.ra.getCalls;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetCalls {
	
	@Test(enabled=false)
	public void getAllUsers(){
		
		RestAssured.baseURI = "https://gorest.co.in";
		given()
		.contentType("application/json")
		.header("Authorization","BearerToken")
		.when()
		.get("/public-api/users")
		.then()
		.statusCode(200)
		.and()
		.header("Server", "nginx");
	}
	
	@Test(enabled=false)
	public void getActiveUsers(){
		RestAssured.baseURI ="https://gorest.co.in";
		given().log().all()
		.contentType("application/json")
		.header("Authorization","BearerToken")
		.when().log().all()
		.get("public-api/users?status=Active")
		.then().log().all()
		.statusCode(200)
		.and().log().all()
		.header("Server", "nginx");
	}
		
	@Test
	public void getInactiveUsers(){
		RestAssured.baseURI="https://gorest.co.in";
		given().log().all()
		.contentType("application/json")
		.header("Authorization","BearerToken")
		.queryParam("status","Inactive")
		.when().log().all()
		.get("public-api/users")
		.then().log().all()
		.statusCode(200)
		.and().log().all()
		.header("Server","nginx");
		
	}
	}


