package com.BridgeLabzPrograms;

import org.json.simple.JSONObject;

public class Patient {

	String name;
	double id;
	double mobileno;
	int age;
	Patient(String name,double id,double mobileno,int age){
		this.name=name;
		this.id=id;
		this.mobileno=mobileno;
		this.age=age;
		
	}
	public JSONObject toJsonObject() {
		JSONObject obj1=new JSONObject();
		obj1.put("name", name);
		obj1.put("id", id);
		obj1.put("mobileno", mobileno);
		obj1.put("age", age);
		return obj1;
	}
	

}
