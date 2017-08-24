package com.BridgeLabzPrograms;

import java.util.Scanner;

public class vendingMachine {

	public static void main(String[] args) {
		int a[]={1,2,5,10,50,100,500,1000};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your amount");
		int amt=sc.nextInt();//349
		if(amt<1000){
		
		for(int j=0;j<a.length;j++){
			while(amt!=0 && amt<a[j]){
				int x=amt/a[j-1];//3
				amt=amt%a[j-1];//94
				System.out.println(x+" no of "+a[j-1]);
				j--;
			}
		}
		
		}else{//2150
			int y=amt/a[a.length-1];//2
			amt=amt%a[a.length-1];//2150%1000=150
			System.out.println(y+" no of "+a[a.length-1]);
			for(int j=0;j<a.length;j++){
				while(amt!=0 && amt<a[j]){
					int x=amt/a[j-1];//3
					amt=amt%a[j-1];//94
					System.out.println(x+" no of "+a[j-1]);
					j--;
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
