package com.ra.updateCall;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateCallAPI {
	public void updateCallsAPI(){

	RestAssured.baseURI = "https://gorest.co.in";
	RequestSpecification request = RestAssured.given().log().all();
	request.contentType("application/json");
	request.header("Authorization", "Bearer f8927c67c5f0286e676b0ccedd17693d636a3b483fe2753ee19f81a601fa9708");
	File payLoad = new File("./src/test/resources/jsonFile/CreateUser.json");
	request.body(payLoad);
	Response response = request.put("/public-api/users");
	System.out.println(response.prettyPrint());
	JsonPath jsonPath = response.jsonPath();
	Object user = jsonPath.get("data.status");
	System.out.println("status");
	
	}
	
}
