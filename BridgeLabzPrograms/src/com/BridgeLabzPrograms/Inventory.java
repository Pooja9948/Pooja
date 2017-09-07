package com.BridgeLabzPrograms;

import org.json.simple.JSONObject;

public class Inventory {

	String name;
	double weight;
	double price;
	public Inventory(String name,double weight,double price){
		this.name=name;
		this.weight=weight;
		this.price=price;
	}
	public JSONObject toJsonObject() {
		JSONObject obj1=new JSONObject();
		obj1.put("name", name);
		obj1.put("weight", weight);
		obj1.put("price", price);
		return obj1;
	}
}
