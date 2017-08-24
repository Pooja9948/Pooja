package com.BridgeLabzPrograms;

import java.util.ArrayList;

public class AnagramPalindromePrime {

	public static void main(String[] args) {
		int limit = 1000;
        System.out.println("Prime numbers between 1 and " + limit);
        checkPrime(limit);
		// TODO Auto-generated method stub

	}
	public static void checkPrime(int limit){
		//int k[]=new int[limit];
		ArrayList<Integer> k = new ArrayList<Integer>(limit);
		for(int i=2; i < limit; i++){
            boolean isPrime = true;
             for(int j=2; j < i ; j++){
                 if(i % j == 0){
                     isPrime = false;
                     break;
                 }
             }
   
             if(isPrime)
            	 for (int i1=1; i1<=limit; i1++)
                     k.add(i1);
                 System.out.print(i + " ");
                 
             //pallindrome(i);
                 //System.out.println("Pallindrome numbers are :");
                // if(pallindrome(i))
                	 //System.out.print(i);
                     
       }
		for (int i1=0; i1<k.size(); i1++)
            System.out.print(k.get(i1)+" ");
		
	}
	public static void pallindrome(int i){
		int res=0;
		int t=i;
			while(i!=0){
			int n=i%10;
			res =(res*10)+n;
			n=n/10;
		}if(t==res)
			System.out.print(i);
	}
	public static void anagram(int i){
		int res=0;
		int t=i;
			while(i!=0){
			int n=i%10;
			res =(res*10)+n;
			n=n/10;
		}if(t==res)
			System.out.print(i);
	}

}
