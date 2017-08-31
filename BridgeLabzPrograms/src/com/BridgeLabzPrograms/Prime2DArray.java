package com.BridgeLabzPrograms;

public class Prime2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 1000;
		//System.out.println("Enter the range : ");
		String [][] strArray=new String[100][100];
		String [] strArray1=checkPrime(limit);
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++){
			    strArray[i][j]=strArray1[j];
				System.out.print(strArray[i][j]);
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

}
