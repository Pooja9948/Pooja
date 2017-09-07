package com.BridgeLabzPrograms;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * @author Clinical Management Program
 *
 */
public class CliniqueManagement {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		CliniqueManagement cm=new CliniqueManagement();
		System.out.println("Clinical Management\n");          
        char ch;
		 do
	        {
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
			case 3:
				cm.commonPart(choice);
				break;
			case 4:
				cm.commonPart(choice);
				break;
			default:
				System.out.println("Invalid Choice !!!");
		}
		System.out.println("\nDo you want to continue (Type y or n) \n");
        ch = sc.next().charAt(0);                        
    } while (ch == 'Y'|| ch == 'y');  
	}
	/**add the doctors details
	 * @throws IOException
	 */
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
		 JSONArray cliniqueArray = null;
		 File file = new File("/home/bridgeit/Pooja/JavaCode/doctor.txt");
		 if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				cliniqueArray = new JSONArray();
			} else {
				try (FileWriter file1 = new FileWriter("/home/bridgeit/Pooja/JavaCode/doctor.json")) {
					file1.write(jobj.toJSONString());
					System.out.println("Successfully Copied JSON Object to File...");
					System.out.println("\nJSON Object: " + jobj);
				}
				/*try {
					bookArray = (JSONArray) jsonParser.parse(new FileReader("/home/bridgeit/Pooja/JavaCode/doctor.json"));
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
		 JSONArray patientArray = null;
		 File file = new File("/home/bridgeit/Pooja/JavaCode/patient.txt");
		 if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				patientArray = new JSONArray();
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
	public void commonPart(int choice) {
		JSONParser parser=new JSONParser();
		String name = sc.next();
		
		JSONArray bookArray = null;
		if (choice==3) {
			try {
				bookArray = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Pooja/JavaCode/doctor.json"));
			} catch (IOException | org.json.simple.parser.ParseException e) {
				e.printStackTrace();
			}
		}else{
			try {
				bookArray = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Pooja/JavaCode/patient.txt"));
			} catch (IOException | org.json.simple.parser.ParseException e) {
				e.printStackTrace();
			}
		}
		
		Iterator iterator=bookArray.iterator();
		int i = 0;
		boolean b = false;
		outer: while (iterator.hasNext()) {
			JSONObject jsonObject = (JSONObject) iterator.next();
			if (jsonObject.get("name").equals(name)) {
				b = true;
				switch (choice) {
				case 3:
					searchDoctor(jsonObject);
					break outer;
				case 4:
					searchPatient(jsonObject);
					break outer;
				}
			}
			i++;
		}
		if (!b) {
			System.out.println("\nSorry!!! Person not found...");
		}
	}
	public void searchDoctor(JSONObject jsonObject) {
		System.out.println("Name:\n" + jsonObject.get("name"));
		System.out.println("id:\n" + jsonObject.get("id"));
		System.out.print(jsonObject.get("specilisation") + ", ");
		System.out.print(jsonObject.get("availability") + " - ");
		}
	public void searchPatient(JSONObject jsonObject) {
		System.out.println("Name:\n" + jsonObject.get("name"));
		System.out.println("id:\n" + jsonObject.get("id"));
		System.out.print(jsonObject.get("mobileno") + ", ");
		System.out.print(jsonObject.get("age") + " - ");
		
	}
}
