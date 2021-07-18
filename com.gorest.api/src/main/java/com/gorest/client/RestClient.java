package com.gorest.client;

import java.util.List;

import com.gorest.common.TestUtils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestClient {
	
	public static void setBaseURI(String baseURI){
		RestAssured.baseURI=baseURI;
	}
	public static RequestSpecification createRequest(String contentType,String token, boolean log){
		RequestSpecification request;
		if(log){
			request = RestAssured.given().log().all();
		}
		else{
			request = RestAssured.given();
		}
		if(token!=null){
			request.header("Authorization","Bearer "+token);
		}
		if(contentType.equalsIgnoreCase("json")){
			request.contentType(ContentType.JSON);
		}
		else if(contentType.equalsIgnoreCase("xml") ){
			request.contentType(ContentType.XML);
		}
		else if(contentType.equalsIgnoreCase("Text")){
			request.contentType(ContentType.TEXT);
		}
		return request;
	}
	
		private static Response executeAPI(String httpMethod, RequestSpecification request, String basePath){
			
			Response response = null;
			switch(httpMethod){
			case "Get" :
				request.get(basePath);
				break;
			case "Post" :
				request.post(basePath);
				break;	
			case "Put" :
				request.put(basePath);
				break;	
			case "Delete" :
				request.delete(basePath);
				break;	
			default:
				System.out.println("Please provide valid Http Request");
				break;
			}
				return response;
		}
		
		public static Response getResponse(String httpMethod, RequestSpecification request, String basePath){
			return executeAPI(httpMethod, request, basePath);
		}
		//****************************************************************************************************
		public static JsonPath getJasonPAth(Response response){
			
			return response.jsonPath();
			
		}
		
		public static int getStatusCode(Response response){
			return response.statusCode();
		}
		public static String getHeaderValue(Response response, String headerName){
			
			return response.getHeader(headerName);
			
		}
	    
		public static List<Header> getResponseHeaders(Response response){
			Headers headers = response.getHeaders();
			List<Header> headersList = headers.asList();
			return headersList;
		}
		
		public static String getPrettyPrint(Response response){
			
			System.out.println("Printing the response ");{
			
			response.prettyPrint();
				
			}
			return response.prettyPrint();
		}
		
		public static Response doGet(String contentType, String baseURI, String basePath, String token, Boolean log){
			RestClient.setBaseURI(baseURI);
			RequestSpecification request = RestClient.createRequest(contentType, token, log);
			return RestClient.getResponse("GET", request, basePath);
			
		}
		
		public static Response doPost(String contentType, String baseURI, String basePath, String token, Boolean log, Object obj){
			
			RestClient.setBaseURI(baseURI);
			RequestSpecification request = RestClient.createRequest(contentType, token, log);
			String payLoad = TestUtils.getSerializedJson(obj);
			request.body(payLoad);
			return RestClient.getResponse("POST", request, basePath);
			
		}

}
