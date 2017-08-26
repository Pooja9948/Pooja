package com.BridgeLabzPrograms;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int c=sc.nextInt();
		sqrt(c);
	}
	static void sqrt(int c){
		int count=0;
		int t=c;
		int  epsilon =(int) 1e-15;
		while(Math.abs(t - c/t) > (epsilon*t) ){
		    // System.out.print(Math.abs(t - c/t));
		     t=c/t;
		     count++;
		}
		System.out.print(count);
	}

}
