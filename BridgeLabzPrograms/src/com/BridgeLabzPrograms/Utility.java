package com.BridgeLabzPrograms;

import java.util.Scanner;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=readArrayInteger();
		dispArrayInteger(a);
        char b[]=readArrayChar();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your case :");
        int x=sc.nextInt();
        switch(x){
        case 1:
        	System.out.println("Enter number to be search");
        	int n=sc.nextInt();
            int i=binarySearchInteger(a,n);
            System.out.println(i);
            break;
        case 2:
        	System.out.println("Enter String to be search");
        	String st=sc.nextLine();
            boolean res=binarySearchString(b,st);
            if(res)
     		   System.out.println(st+" is present in the file");
     	    else
     		   System.out.println(st+" is not present in the file");
            break;
        case 3:
            int ar[]=insertionSortInteger(a);
            for(int j=0;j<ar.length;j++)
            	System.out.print(ar[j]+" ");
            break;
        case 4:
            String[] st1=insertionSortString(b);
            String st2=st1.toString();
           	System.out.println(st2);
            break;
        case 5:
            int y[]=bubbleSortInteger(a);
            for(int j=0;j<y.length;j++)
            	System.out.println(y[j]);
            break;
        case 6:
            char y1[]=bubbleSortString(b);
            for(int j=0;j<y1.length;j++)
            	System.out.println(y1[j]);
            break;
        default:
        	System.out.println("Invalid choice");
        }
        
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
	static int binarySearchInteger(int ar[],int n){
		int start = 0;
	    int end = ar.length - 1;

	    while (start <= end) {
	        int mid = (start + end) / 2;
	        if (ar[mid] == n) {
	            return mid;
	        } else if (ar[mid] < n) {
	            end = mid - 1;

	        } else {
	            start = mid + 1;
	        }
	    }

	    return -1;
		
		
	}
    static boolean binarySearchString(char c1[],String st){
    	char c2[]=st.toCharArray();
 	   for(int i=0;i<c1.length;i++){
 		   int k=i,j=0;
 		   while(k<c1.length && j<c2.length && c1[k]==c2[j]){
 			   k++;
 			   j++;
 		   }
 		   if(j==c2.length)
 			   return true;
 	   }
 	   return false;
    	
	}
    static int[] insertionSortInteger(int ar[]){
    	int n = ar.length;
        for (int i=1; i<n; ++i)
        {
            int key = ar[i];
            int j = i-1;
 
            while (j>=0 && ar[j] > key)
            {
                ar[j+1] = ar[j];
                j = j-1;
            }
            ar[j+1] = key;
        }
    	return ar;
	}
    static String[] insertionSortString(char ar[]){
    	String sting1 = ar.toString();
    	String[] sting = sting1.split(" ");
		for (int j = 0; j < sting.length; j++) {
			int i = 0;
			String key = sting[j];
			i = j - 1;
			while (i >= 0) {
				if (key.compareTo(sting[i]) > 0) {
					break;
				}
				sting[i + 1] = sting[i];
				i--;
			}
			sting[i + 1] = key;
		}
		return sting;
    	
	}
    static int[] bubbleSortInteger(int ar[]){
    	for(int i=0;i<ar.length;i++){
    		for(int j=i+1;j<ar.length;j++){
    			if(ar[i]>ar[j]){
    				int temp=ar[i];
    				ar[i]=ar[j];
    				ar[j]=temp;
    			}
    		}
    	}
    	return ar;
	}
    static char[] bubbleSortString(char ar[]){
    	char temp;
    	for(int i=0; i<ar.length; i++) {
             for(int j=i+1; j<ar.length-1-i; j++) {
                  if(ar[j]<ar[i]) {
    	              temp = ar[j];
    	              ar[j] = ar[j+1];
                      ar[j+1] = temp;
    	
    	          }
    	
    	     }
    	
    	}
    	return ar;
	}
}
