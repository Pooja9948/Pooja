package com.BridgeLabzPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
//import java.nio.charset.Charset;
//import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class OrderedList {

	public static void main(String[] args) throws FileNotFoundException,IOException,NullPointerException, NumberFormatException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   String content = readFile("/home/bridgeit/Pooja/JavaCode/MyFile1.txt");
		   System.out.println(content);
	 	   String[] sta = content.split(" ");
	 	   //sort(sta);
	 	   for(int i=0;i<sta.length;i++)
	 	   {
	 		   /*for(int j=i+1;j<sta.length;j++){
	 			   if(sta[i] > sta[j]){
	 				   String temp=sta[i];
	 				   sta[i]=sta[j];
	 				   sta[j]=temp;
	 			   }
	 		   }*/
	 	   System.out.println("----"+sta[i]);
	 	   }
		   LinkedList<Integer> list = new LinkedList<Integer>();
		   for (String stng : sta)
	       {
			   list.add(Integer.parseInt(stng.trim()));
			  // System.out.println(list);
	       }
		   Collections.sort(list);
		   System.out.println(list);//display linked list
		   System.out.println("Enter a number to be search : ");
		   int num=sc.nextInt();
		   int position;

			if ((position = list.indexOf(num)) == -1) {
				System.out.println("this word is not present ...");
				list.add(num);
				Collections.sort(list);
			} else {
				System.out.println("Word is removing from the list.");
				list.remove(num);
			}
			try {
				int len1 = list.size();
				PrintWriter printWriter = new PrintWriter("/home/bridgeit/Pooja/JavaCode/MyFile1.txt");
				for (int i = 0; i < len1; i++) {
					int integer = list.pop();
					printWriter.write(integer +" ");
				}
				printWriter.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}

	 static String readFile(String fileName) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader("/home/bridgeit/Pooja/JavaCode/MyFile1.txt"));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	
	        while (line != null) {
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
}

}
