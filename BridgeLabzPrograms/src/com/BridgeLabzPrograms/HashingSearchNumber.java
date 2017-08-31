package com.BridgeLabzPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HashingSearchNumber {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		for(int i=0;i<=11;i++){
			int[] a=new int[];
		}
		Scanner sc=new Scanner(System.in);
		File f1=new File("/home/bridgeit/Pooja/JavaCode/MyFile1.txt");
 	   FileReader fr1=new FileReader(f1);
 	   int len=(int)f1.length();
 	   char[] c1=new char[len];
 	   fr1.read(c1);
 	   System.out.println(c1);
 	   String st = new String(c1);
 	   System.out.println("Enter a number to be search : ");
 	   int n=sc.nextInt();
 	   char[] num=st.toCharArray();
       for(int i=0;i<num.length;i++){
    	   if(num[i]%11==0){
    		   for(int j=0;j<a.length;j++){
    		   int a[j]= (int) num[i];
    		   }
    	   }
           if(num[i]%11==1){
        	   int a[]= (int) num[i];
    	   }
           if(num[i]%11==2){
        	   int a[2]= (int) num[i];
    	   }
           if(num[i]%11==3){
        	   int a[3]= (int) num[i];
    	   }
           if(num[i]%11==4){
        	   int a[4]= (int) num[i];
    	   }
           if(num[i]%11==5){
        	   int a[5]= (int) num[i];
    	   }
           if(num[i]%11==6){
        	   int a[6]= (int) num[i];
           }
           if(num[i]%11==7){
        	   int a[7]= (int) num[i];
		   }
		   if(num[i]%11==8){
			   int a[8]= (int) num[i];   
		   }
		   if(num[i]%11==9){
			   int a[9]= (int) num[i];   
		   }
		   if(num[i]%11==10){
			   int a[10]= (int) num[i];   
			}
       }
	}

}
