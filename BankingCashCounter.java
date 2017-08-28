package com.BridgeLabzPrograms;

import java.util.Scanner;

public class BankingCashCounter {
	
	 int size = 0;  
	 int top = -1;  
	 int rear = 0; 
	 private static final int n = 10; 
	 int[] a=new int[n];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice 1 for deposit and 2 for withdrawl ");
		int x=sc.nextInt();
		BankingCashCounter bcc = new BankingCashCounter();  
		switch(x)
		{
		case 1:
			System.out.println("Enter number to be insert : ");
			int num=sc.nextInt();
			bcc.push(num); 
			break;
		case 2:
			bcc.pop();
			break;
		default:
			System.out.println("Invalid choice !!!!!");
		}
	}
	public void push(int pushedElement) {  
		  if (top < n - 1) {  
		   top++;  
		   a[top] = pushedElement;  
		   System.out.println("Element " + pushedElement  
		     + " is pushed to Queue !");  
		   display();  
		  } else {  
		   System.out.println("Overflow !");  
		  }  
		  
	 }  
		  
	 public void pop() {  
	  if (top >= rear) {  
	   rear++;  
	   System.out.println("Pop operation done !");  
	   display();  
	  } else {  
	   System.out.println("Underflow !");  
	  }  
	 }  
		  
	 public void display() {  
	  if (top >= rear) {  
	   System.out.println("Elements in Queue : ");  
	   for (int i = rear; i <= top; i++) {  
	    System.out.println(a[i]);  
	   }  
	  }  
	 }  

}
