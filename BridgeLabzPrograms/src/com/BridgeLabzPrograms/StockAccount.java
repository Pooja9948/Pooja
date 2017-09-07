package com.BridgeLabzPrograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StockAccount {

	static Scanner scanner=new Scanner(System.in);
	File file=new File("/home/bridgeit/Pooja/JavaCode");
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
	public static void main(String[] args){
		StockAccount stockaccount=new StockAccount();
		System.out.println("Enter customer information ");
		System.out.println("Enter the customer name : ");
		String name=scanner.nextLine();
		System.out.println("Enter customer id : ");
		int id=scanner.nextInt();
		System.out.println("Enter stock amount : ");
		int amount=scanner.nextInt();
		System.out.println("Enter customer symbol : ");
		String symbol=scanner.nextLine();
		System.out.println("Enter 1 for buy ");
		System.out.println("Enter 2 for sell ");
		int choice=scanner.nextInt();
		switch(choice){
		case 1:
			stockaccount.buy(amount);
			break;
		case 2:
			stockaccount.sell(amount);
			break;
		}
	}
    public void buy(int amount){
    	
    	System.out.println("Enter your amount to buy ");
    	int buyamount=scanner.nextInt();
    	amount=amount-buyamount;
    	save(file);
	}
	public void sell(int amount) {
		
		System.out.println("Enter your amount to sell ");
    	int sellamount=scanner.nextInt();
    	amount=amount+sellamount;
    	save(file);
	}
	
	
	double valueOf(){
		return 0;
	}
	void save(File file){
		
	}
	
}
