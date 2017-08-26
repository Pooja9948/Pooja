package com.BridgeLabzPrograms;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class BinarySearchWord {
       public static void main(String[] args) throws FileNotFoundException,IOException{
    	   File f1=new File("/home/bridgeit/Pooja/JavaCode/MyFile.txt");
    	   FileReader fr1=new FileReader(f1);
    	   int len=(int)f1.length();
    	   char[] c1=new char[len];
    	   fr1.read(c1);
    	   System.out.println(c1);
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter a word to search");
    	   String st=sc.nextLine();
    	   boolean res=checkWord(c1,st);
    	   if(res)
    		   System.out.println(st+" is present in the file");
    	   else
    		   System.out.println(st+" is not present in the file");
	    }

       static boolean checkWord(char c1[],String st) {
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
}
