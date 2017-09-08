package com.BridgeLabzPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {

	static Scanner scanner=new Scanner(System.in);
	File file=new File("/home/bridgeit/Pooja/JavaCode/test2.txt");
	StockAccount(String f1){
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else
			System.out.println("File already exist!!!");
	}
	public StockAccount() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws IOException{
		StockAccount stockaccount=new StockAccount();
		stockaccount.sharePrice();
		String content = readFile("/home/bridgeit/Pooja/JavaCode/sharePrice.txt");
	    System.out.println(content);
 	    String[] sta = content.split(" ");
		System.out.println("Enter customer information ");
		System.out.println("Enter the customer name : ");
		String name=scanner.nextLine();
		System.out.println("Enter customer id : ");
		int id=scanner.nextInt();
		System.out.println("Enter stock amount : ");
		int amount=scanner.nextInt();
		//System.out.println("Enter customer symbol : ");
		//String symbol=scanner.nextLine();
		System.out.println("Enter 1 for buy ");
		System.out.println("Enter 2 for sell ");
		int choice=scanner.nextInt();
		switch(choice){
		case 1:
			stockaccount.buy(name,id,amount,sta);
			break;
		case 2:
			stockaccount.sell(name,id,amount,sta);
			break;
		}
	}
    public void buy(String name,int id,double amount,String[] sta){
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
		   for (String stng : sta)
	       {
			   list.add(Integer.parseInt(stng.toString()));
			  // System.out.println(list);
	       }
		   int buyamount=list.get(1); 
    	
    	amount=amount-buyamount;
    	save(name,id,amount);
	}
	public void sell(String name,int id,double amount,String[] sta) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		   for (String stng : sta)
	       {
			   
			   list.add(Integer.parseInt(stng.trim()));
			  // System.out.println(list);
	       }
		   int sellamount=list.get(0);   
		
    	amount=amount+sellamount;
    	save(name,id,amount);
	}
	
	
	double valueOf(){
		return 0;
	}
	void save(String name,int id,double amount){
		try {
			PrintWriter printWriter = new PrintWriter("/home/bridgeit/Pooja/JavaCode/test2.txt");
				printWriter.write("Name : "+name+" id : "+id+" amount : "+amount + " ");
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	char ch;
	public void sharePrice(){
		do{
		
		System.out.println("Enter Stock name ");
		String stockname=scanner.nextLine();
		System.out.println("Enter price of share for sell ");
		int sharesell=scanner.nextInt();
		String sharesell1=String.valueOf(sharesell);
		System.out.println("Enter price of share for buy ");
		int sharebuy=scanner.nextInt();
		String sharebuy1=String.valueOf(sharebuy);
		System.out.println("\nDo you want to continue (Type y or n) \n");
	    ch = scanner.next().charAt(0);
	    scanner.nextLine();
	    ArrayList list = new ArrayList();
		   list.add(stockname);
		   list.add(sharesell1);
		   list.add(sharebuy1);
	    try {
			PrintWriter printWriter = new PrintWriter("/home/bridgeit/Pooja/JavaCode/sharePrice.txt");
			for (int i = 0; i < list.size(); i++) {
				String st1 = (String) list.get(i);
				printWriter.write(st1 + " ");
			}
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		}while(ch == 'Y'|| ch == 'y');
	}
	static String readFile(String fileName) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader("/home/bridgeit/Pooja/JavaCode/sharePrice.txt"));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	
	        while (line != null) {
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}
	
}
