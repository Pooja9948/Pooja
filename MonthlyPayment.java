package com.BridgeLabzPrograms;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pricipal value : ");
        double p=sc.nextDouble();
        System.out.println("Enter the rate of interest : ");
        double R=sc.nextDouble();
        System.out.println("Enter the no of years : ");
        double y=sc.nextDouble();
        monthlyPayment(p,R,y);
	}
	public static void monthlyPayment(double p,double R,double y){
		double r = R/(12*100);
		double n=12*y;
		double x=Math.pow((1+r),(-n));
		double payment=(p*r)/(1-x);
		System.out.println("The payment is : "+payment);
	}

}
