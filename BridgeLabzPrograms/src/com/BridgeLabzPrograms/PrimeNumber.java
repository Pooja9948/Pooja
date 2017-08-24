package com.BridgeLabzPrograms;

class PrimeNumber{

	public static void main(String[] args){
		 int limit = 1000;
         System.out.println("Prime numbers between 1 and " + limit);
         for(int i=2; i < limit; i++){
                boolean isPrime = true;
                 for(int j=2; j < i ; j++){
                     if(i % j == 0){
                         isPrime = false;
                         break;
                     }
                 }
       
                 if(isPrime)
                         System.out.println(i + " ");
         }
	}
}

