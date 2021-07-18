package com.gorest.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestUtils {
	
	public static String getSerializedJson(Object object){
		ObjectMapper mapper;
		String jsonString = null;
		mapper = new ObjectMapper();
		try {
			jsonString = mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonString;
	}

}
