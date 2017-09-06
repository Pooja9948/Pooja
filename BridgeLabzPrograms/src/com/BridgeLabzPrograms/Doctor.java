package com.BridgeLabzPrograms;

import org.json.simple.JSONObject;

public class Doctor {

	String name;
	double id;
	String specilisation;
	String availability;
	Doctor(String name,double id,String specilisation,String availability){
		this.name=name;
		this.id=id;
		this.specilisation=specilisation;
		this.availability=availability;
		
	}
	public JSONObject toJsonObject() {
		JSONObject obj1=new JSONObject();
		obj1.put("name", name);
		obj1.put("id", id);
		obj1.put("specilisation", specilisation);
		obj1.put("availability", availability);
		return obj1;
	}

}
