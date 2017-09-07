package com.BridgeLabzPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AddressBookRequest {

	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		AddressBookRequest adr=new AddressBookRequest();
		
		System.out.println("1. Add a person ");
		System.out.println("2. Delete a person ");
		System.out.println("3. search a person ");  
		System.out.println("4. edit a person ");
		System.out.println("Enter your choice ");
		int n=sc.nextInt();
		switch(n){
		case 1:
			adr.addPerson();
			break;
		case 2:
			adr.commonPart(n);
			break;
		case 3:
			adr.commonPart(n);
			break;
		default:
			System.out.println("Invalid choice !!!");	
		}
	}
public void addPerson() throws IOException {
	    sc.nextLine();
		System.out.println("Enter first name : ");
		String firstname=sc.nextLine();
		
		System.out.println("Enter last name : ");
		String lastname=sc.nextLine();
		
		System.out.println("Enter address : ");
		String address=sc.nextLine();
		
		System.out.println("Enter city : ");
		String city=sc.nextLine();
		
		System.out.println("Enter state : ");
		String state=sc.nextLine();
		
		System.out.println("Enter zip : ");
		int zip=sc.nextInt();
		
		System.out.println("Enter phoneno : ");
		double phoneno=sc.nextDouble();
		
		PersonDetails pdetail=new PersonDetails(firstname,lastname,address,city,state,zip,phoneno);
		JSONObject jobj = pdetail.toJsonObject();
		updateJson(jobj);
	}
	public void updateJson(JSONObject jobj) throws IOException{
		 JSONParser jsonParser = new JSONParser();
		 JSONArray bookArray = null;
		 File file = new File("/home/bridgeit/Pooja/JavaCode/AddressBook.json");
		 if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				bookArray = new JSONArray();
			} else {
				try (FileWriter file1 = new FileWriter("/home/bridgeit/Pooja/JavaCode/AddressBook.json")) {
					file1.write(jobj.toJSONString());
					System.out.println("Successfully Copied JSON Object to File...");
					System.out.println("\nJSON Object: " + jobj);
				}
				/*try {
					bookArray = (JSONArray) jsonParser.parse(new FileReader("/home/bridgeit/Pooja/JavaCode/AddressBook.txt"));
				} catch (IOException | org.json.simple.parser.ParseException e) {
					e.printStackTrace();
				}*/
			}
	}
	public void edit(JSONObject jsonObject, JSONArray bookArray, int i) {
		System.out.println("What do you want to edit ?");
		System.out.println("1. Address");
		System.out.println("2. Phone Number");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Enter address: ");
			sc.nextLine();
			String address = sc.nextLine();
			System.out.print("Enter city, state and pincode :");
			String city = sc.next();
			String state = sc.next();
			String pincode = sc.next();

			jsonObject.put("Address", address);
			jsonObject.put("City", city);
			jsonObject.put("State", state);
			jsonObject.put("pincode", pincode);
			break;

		case 2:
			System.out.println("Enter phone number: ");
			String phoneNumber = sc.next();
			jsonObject.put("Phone Number", phoneNumber);
			break;
		}
		bookArray.remove(i);
		bookArray.add(i, jsonObject);
		printWriter(bookArray);
		System.out.println("Contact updated successfully");
	}
	public void delete(JSONArray bookArray, int i) {
		bookArray.remove(i);
		printWriter(bookArray);
		System.out.println("Contact deleted successfully");
	}
	public void commonPart(int choice) {
		JSONParser parser=new JSONParser();
		String firstName = sc.next();
		String lastName = sc.next();
		JSONArray bookArray = null;
		try {
			bookArray = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Pooja/JavaCode/AddressBook.json"));
		} catch (IOException | org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		Iterator iterator=bookArray.iterator();
		int i = 0;
		boolean b = false;
		outer: while (iterator.hasNext()) {
			JSONObject jsonObject = (JSONObject) iterator.next();
			if (jsonObject.get("First Name").equals(firstName) && jsonObject.get("Last Name").equals(lastName)) {
				b = true;
				switch (choice) {
				case 2:
					edit(jsonObject, bookArray, i);
					break outer;
				case 3:
					delete(bookArray, i);
					break outer;
				case 4:
					search(jsonObject);
					break outer;
				}
			}
			i++;
		}
		if (!b) {
			System.out.println("\nSorry!!! Person not found...");
		}
	}
	public void search(JSONObject jsonObject) {
		System.out.println("Name:\n" + jsonObject.get("First Name") + " " + jsonObject.get("Last Name"));
		System.out.println("Address:\n" + jsonObject.get("Address"));
		System.out.print(jsonObject.get("City") + ", ");
		System.out.print(jsonObject.get("State") + " - ");
		System.out.println(jsonObject.get("pincode"));
		System.out.println("Phone Number:\n" + jsonObject.get("Phone Number"));
	}
	public void printWriter(JSONArray bookArray) {
		try {
			PrintWriter printWriter = new PrintWriter("/home/bridgeit/Pooja/JavaCode/AddressBook.json");
			printWriter.write(bookArray.toJSONString());
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
