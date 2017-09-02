package com.BridgeLabzPrograms;

import java.util.Scanner;

public class Prime2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 1000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range : ");
		int rng=sc.nextInt();
		String [][] strArray=new String[rng][rng];
		String [] strArray1=checkPrime(limit);
		boolean b;
		for(int i=0;i<strArray1.length;i++){
			for(int j=0;j<strArray1.length;j++){
				b=checkAnagram(strArray1[i],strArray1[j]);
				if(b){
					System.out.println(strArray1[i]+" ");
				}
			}
		}
		
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++){
			    strArray[i][j]=strArray1[j];
				System.out.print(strArray[i][j]+" ");
			}
			System.out.println(" ");
		}

	}
	public static String[] checkPrime(int limit){
		String[] arry = new String[100];
		int position=0;
		for(int i=2; i < limit; i++){
            boolean isPrime = true;
             for(int j=2; j < i ; j++){
                 if(i % j == 0){
                     isPrime = false;
                     break;
                 }
             }
   
             if(isPrime){
            	
            	arry[position] = String.valueOf(i);
				position++;
             }
             
		}
         String[] array1 = new String[position];
 		for (int k = 0; k < position; k++) {
 			
 			array1[k] = arry[k];
 		}
 		
 		return array1;
             
	}
	public static boolean checkAnagram(String str1, String str2){
		int position;
		if(str1.length()!=str2.length())
		{
			return false;
		}
		char[] a = str1.toCharArray();
		sort(a);
		char[] b = str2.toCharArray();
		sort(b);
		
 		return true;
	}
	public static void sort(char[] ab){
		for(int i=0;i<ab.length;i++){
			for(int j=i+1;j<ab.length;j++){
				if(ab[i]>ab[j]){
					char temp=ab[i];
					ab[i]=ab[j];
					ab[j]=temp;
				}
			}
		}
	}

}
