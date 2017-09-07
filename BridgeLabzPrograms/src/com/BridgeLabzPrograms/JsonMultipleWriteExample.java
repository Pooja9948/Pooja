package com.BridgeLabzPrograms;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonMultipleWriteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Lokesh");
        employeeDetails.put("lastName", "Gupta");
        employeeDetails.put("website", "howtodoinjava.com");
        
        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);
        
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Brian");
        employeeDetails2.put("lastName", "Schultz");
        employeeDetails2.put("website", "example.com");
         
        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);
        
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        
        try (FileWriter file = new FileWriter("/home/bridgeit/Desktop/test1.json")) {
        	 
            file.write(employeeList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
