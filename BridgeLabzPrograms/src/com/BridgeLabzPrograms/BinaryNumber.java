package com.BridgeLabzPrograms;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
        int n=sc.nextInt();
        toBinary(n);
	}
    public static void toBinary(int n){//
    	int binary[] = new int[40];
        int index = 0;
        while(n > 0){
          binary[index++] = n%2;
          n = n/2;
        }
        for(int i = index-1;i >= 0;i--){
          System.out.print(binary[i]);
        }
    	
    }
}
