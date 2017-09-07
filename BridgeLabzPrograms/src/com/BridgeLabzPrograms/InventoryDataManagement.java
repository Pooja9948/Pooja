package com.BridgeLabzPrograms;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class InventoryDataManagement {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InventoryDataManagement idm=new InventoryDataManagement();
		System.out.println("Inventory Data Management\n");          
        char ch;
        do
        {
			System.out.println("1. Enter rice details");
			System.out.println("2. Enter pulses details");
			System.out.println("3. Enter wheats details ");
			System.out.println("Enter your choice ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					idm.addRice();
					break;
				case 2:
					idm.addPulses();
					break;
				case 3:
					idm.addWheats();
					break;
				default:
					System.out.println("Invalid Choice !!!");
			}
			System.out.println("\nDo you want to continue (Type y or n) \n");
		    ch = sc.next().charAt(0);                        
		} while (ch == 'Y'|| ch == 'y');  
	}
	 
		public void addRice() throws IOException{
			sc.nextLine();
			System.out.println("Enter rice name : ");
			String name=sc.nextLine();
			System.out.println("Enter weight : ");
			double weight=sc.nextDouble();
			System.out.println("Enter price per kg : ");
			double price=sc.nextDouble();
			Inventory inventory=new Inventory(name,weight,price);
			JSONObject jobj = inventory.toJsonObject();
			updateJsonRice(jobj);
		}
		public void addPulses() throws IOException{
			sc.nextLine();
			System.out.println("Enter pulses name : ");
			String name=sc.nextLine();
			System.out.println("Enter weight : ");
			double weight=sc.nextDouble();
			System.out.println("Enter price per kg : ");
			double price=sc.nextDouble();
			Inventory inventory=new Inventory(name,weight,price);
			JSONObject jobj = inventory.toJsonObject();
			updateJsonPulse(jobj);
		}
		public void addWheats() throws IOException{
			sc.nextLine();
			System.out.println("Enter wheats name : ");
			String name=sc.nextLine();
			System.out.println("Enter weight : ");
			double weight=sc.nextDouble();
			System.out.println("Enter price per kg : ");
			double price=sc.nextDouble();
			Inventory inventory=new Inventory(name,weight,price);
			JSONObject jobj = inventory.toJsonObject();
			updateJsonWheats(jobj);
		}
		public void updateJsonRice(JSONObject jobj) throws IOException{
			 JSONParser jsonParser = new JSONParser();
			 JSONArray riceArray = null;
			 File file = new File("/home/bridgeit/Pooja/JavaCode/rice.json");
			 if (!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
					riceArray = new JSONArray();
				} else {
					/*try {
						riceArray = (JSONArray) jsonParser.parse(new FileReader("/home/bridgeit/Pooja/JavaCode/rice.json"));
					} catch (IOException | org.json.simple.parser.ParseException e) {
						e.printStackTrace();
					}*/
					try (FileWriter file1 = new FileWriter("/home/bridgeit/Pooja/JavaCode/rice.json")) {
						//file1.write(jobj.toJSONString());
						file1.append((CharSequence) riceArray, 0, riceArray.size());
						file1.write(jobj.toJSONString());
						System.out.println("Successfully Copied JSON Object to File...");
						System.out.println("\nJSON Object: " + jobj);
					}
				}
		}
		public void updateJsonPulse(JSONObject jobj) throws IOException{
			JSONParser jsonParser = new JSONParser();
			 JSONArray pulseArray = null;
			 File file = new File("/home/bridgeit/Pooja/JavaCode/pulse.json");
			 if (!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
					pulseArray = new JSONArray();
				} else {
					/*try {
						pulseArray = (JSONArray) jsonParser.parse(new FileReader("/home/bridgeit/Pooja/JavaCode/pulse.json"));
					} catch (IOException | org.json.simple.parser.ParseException e) {
						e.printStackTrace();
					}*/
					try (FileWriter file1 = new FileWriter("/home/bridgeit/Pooja/JavaCode/pulse.json")) {
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
		public void updateJsonWheats(JSONObject jobj) throws IOException{
			 JSONParser jsonParser = new JSONParser();
			 JSONArray wheatArray = null;
			 File file = new File("/home/bridgeit/Pooja/JavaCode/wheats.json");
			 if (!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
					wheatArray = new JSONArray();
				} else {
					/*try {
						wheatArray = (JSONArray) jsonParser.parse(new FileReader("/home/bridgeit/Pooja/JavaCode/wheats.json"));
					} catch (IOException | org.json.simple.parser.ParseException e) {
						e.printStackTrace();
					}*/
					try (FileWriter file1 = new FileWriter("/home/bridgeit/Pooja/JavaCode/wheats.json")) {
						file1.write(jobj.toJSONString());
						System.out.println("Successfully Copied JSON Object to File...");
						System.out.println("\nJSON Object: " + jobj);
					}
				}
		}
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
*/	

}
