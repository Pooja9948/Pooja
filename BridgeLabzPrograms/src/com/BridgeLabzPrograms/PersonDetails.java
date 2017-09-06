package com.BridgeLabzPrograms;

import org.json.simple.JSONObject;

public class PersonDetails {

	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	int zip;
	double phoneno;
	PersonDetails(String firstname,String lastname,String address,String city,String state,int zip,double phoneno){
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phoneno=phoneno;
	}
	
	
	public JSONObject toJsonObject() {
		JSONObject obj1=new JSONObject();
		obj1.put("firstname", firstname);
		obj1.put("lastname", lastname);
		obj1.put("address", address);
		obj1.put("city", city);
		obj1.put("state", state);
		obj1.put("zip", zip);
		obj1.put("phoneno", phoneno);
		return obj1;
	}
	
}
