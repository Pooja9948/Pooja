package com.BridgeLabzPrograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CliniqueManagement {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		CliniqueManagement cm=new CliniqueManagement();
		System.out.println("1. Enter doctor details");
		System.out.println("2. Enter patient details");
		System.out.println("3. search doctor ");
		System.out.println("4. search patient ");
		System.out.println("Enter your choice ");
		int choice=sc.nextInt();
		switch(choice){
			case 1:
				cm.addDoctor();
				break;
			case 2:
				cm.addPatient();
				break;
			/*case 3:
				cm.searchDoctor();
				break;
			case 4:
				cm.searchPatient();
				break;*/
			default:
				System.out.println("Invalid Choice !!!");
		}
	}
	public void addDoctor() throws IOException{
		sc.nextLine();
		System.out.println("Enter name : ");
		String name=sc.nextLine();
		System.out.println("Enter id : ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter specialisation : ");
		String specialisation=sc.nextLine();
		System.out.println("Enter availability : ");
		String availability=sc.nextLine();
		Doctor d=new Doctor(name,id,specialisation,availability);
		JSONObject jobj = d.toJsonObject();
		updateJsonDoctor(jobj);
	}
	public void updateJsonDoctor(JSONObject jobj) throws IOException{
		 JSONParser jsonParser = new JSONParser();
		 JSONArray bookArray = null;
		 File file = new File("/home/bridgeit/Pooja/JavaCode/doctor.txt");
		 if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				bookArray = new JSONArray();
			} else {
				try (FileWriter file1 = new FileWriter("/home/bridgeit/Pooja/JavaCode/doctor.txt")) {
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
	public void addPatient() throws IOException{
		sc.nextLine();
		System.out.println("Enter name : ");
		String name=sc.nextLine();
		System.out.println("Enter id : ");
		int id=sc.nextInt();
		System.out.println("Enter mobileno : ");
		double mobileno=sc.nextDouble();
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		Patient p=new Patient(name,id,mobileno,age);
		JSONObject jobj1 = p.toJsonObject();
		updateJsonPatient(jobj1);
	}
	public void updateJsonPatient(JSONObject jobj) throws IOException{
		 JSONParser jsonParser = new JSONParser();
		 JSONArray bookArray = null;
		 File file = new File("/home/bridgeit/Pooja/JavaCode/patient.txt");
		 if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				bookArray = new JSONArray();
			} else {
				try (FileWriter file1 = new FileWriter("/home/bridgeit/Pooja/JavaCode/patient.txt")) {
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
}
