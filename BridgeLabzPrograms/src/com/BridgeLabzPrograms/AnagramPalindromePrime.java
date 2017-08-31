package com.BridgeLabzPrograms;

import java.util.ArrayList;

public class AnagramPalindromePrime {

	public static void main(String[] args) {
		int limit = 1000;
        System.out.println("Prime numbers between 1 and " + limit);
        String [] strArray=checkPrime(limit);
        for(int i=0;i<strArray.length;i++){
        System.out.println(strArray[i]);
        }
        System.out.println("Anagram in given range of prime numbers are:");
        for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (checkAnagram(strArray[i], strArray[j])) {
					System.out.println(strArray[i] + "  " + strArray[j]);
				}
			}
		}
        System.out.println("Palindrome in given range of prime numbers are:");
		for (int i = 0; i < strArray.length; i++) {
			if (palindrome(strArray[i])) {
				System.out.println(strArray[i]);
			}
		}
		// TODO Auto-generated method stub

	}
	public static String[] checkPrime(int limit){
		String[] array = new String[1000];
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
            	 array[position] = String.valueOf(i);
				position++;
             }
		}
         String[] array1 = new String[position];
 		for (int k = 0; k < position; k++) {
 			array1[k] = array[k];
 		}
 		return array1;
             
	}
	public static boolean palindrome(String s){
		if (s.length() < 2) {
			return false;
		}
		char[] c = s.toCharArray();
		int n = c.length;
		for (int i = 0; i < n; i++) {
			if (c[i] != c[n - 1 - i]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkAnagram(String string1 , String string2)
	{
		if(string1.length()!=string2.length())
		{
			return false;
		}
		char[] a = string1.toCharArray();
		sort(a);
		char[] b = string2.toCharArray();
		sort(b);
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=b[i])
			{
				return false;
			}
		}
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
