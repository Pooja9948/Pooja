package com.BridgeLabzPrograms;

import java.util.Scanner;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=readArrayInteger();
		dispArrayInteger(a);
        char b[]=readArrayChar();
        binarySearchInteger(a);
        binarySearchString(b);
        insertionSortInteger(a);
        insertionSortString(b);
        bubbleSortInteger(a);
        bubbleSortString(b);
        
	}
	static int[] readArrayInteger(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		return ar;
	}
	static void dispArrayInteger(int ar[]){
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}
	static char[] readArrayChar(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String st=sc.nextLine();
		char ar[]=st.toCharArray();
		
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]);
		return ar;
	}
	static int[] binarySearchInteger(int ar[]){
		return ar;
	}
    static char[] binarySearchString(char ar[]){
    	return ar;
	}
    static int[] insertionSortInteger(int ar[]){
    	return ar;
	}
    static char[] insertionSortString(char ar[]){
    	return ar;
	}
    static int[] bubbleSortInteger(int ar[]){
    	return ar;
	}
    static char[] bubbleSortString(char ar[]){
    	return ar;
	}
}
