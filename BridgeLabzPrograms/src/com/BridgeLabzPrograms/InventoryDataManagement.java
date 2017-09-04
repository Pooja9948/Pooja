package com.BridgeLabzPrograms;

import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class InventoryDataManagement {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of products");
		int n=sc.nextInt();
		Object[] obj=new Object[n];
		int len=obj.length;
		System.out.println("Products are : ");
		/*List<E>
		JSONObject obj1=new JSONObject();
		System.out.println("Enter no of products ");
		int n=sc.nextInt();
		for (int i = 0; i < 3; i++) {
			obj1.put();
		}
		String name="";
		double weight=0,price=0;
		JSONArray arr = new JSONArray();  
		JSONObject pDetail1 = new JSONObject();
		JSONObject pDetail2 = new JSONObject();
		JSONObject pDetail3 = new JSONObject();
		pDetail1.put("name", "basmati");
		pDetail1.put("wt", 3);
		pDetail1.put("pc", 50);

		pDetail2.put("name","kolam");
		pDetail2.put("wt", 4);
		pDetail2.put("pc", 78);

		pDetail3.put("name", "sonamasuri");
		pDetail3.put("wt", 2);
		pDetail3.put("pc", 49);

		arr.add(pDetail1);
		arr.add(pDetail2);
		arr.add(pDetail3);
		for (int i = 0; i <= n; i++) {
			System.out.println("enter product name");
			String pnm=sc.nextLine();
			arr.add(pnm);
		}
		arr.add("rice");
		arr.add("pulses");
		arr.add("wheats");
		System.out.print(arr);
		for(int i = 0 ; i < objects.length ; i++) {
		    objects[i] = new JSONObject();
		}
		System.out.println("Enter your product to add :");
		System.out.println("1. Rice");
		System.out.println("2. Pulses");
		System.out.println("3. Wheats");
		int x=sc.nextInt();
		switch(x){
		case 1:
			System.out.println("Name: "+productName());
			System.out.println("Weight : "+productWeight());
			System.out.println("Price per Kg : "+productPrice());
			break;
		case 2:
			System.out.println("Name: "+productName());
			System.out.println("Weight : "+productWeight());
			System.out.println("Price per Kg : "+productPrice());
			break;
		case 3:
			System.out.println("Name: "+productName());
			System.out.println("Weight : "+productWeight());
			System.out.println("Price per Kg : "+productPrice());
			break;
		default:
			System.out.println("Invalid choice ");
		}
	}
	static String productName(){
		System.out.println("Enter product name : ");
		String ProductNM=sc.nextLine();
		return ProductNM;
	}
	static double productWeight(){
		System.out.println("Enter product weight : ");
		double ProductWT=sc.nextDouble();
		return ProductWT;
	}
	static double productPrice(){
		System.out.println("Enter product price per kg : ");
		double ProductPP=sc.nextDouble();
		return ProductPP;
*/	}

}
