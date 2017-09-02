package com.BridgeLabzPrograms;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
public class UnorderedList {
	
	   public static void main(String[] args) throws FileNotFoundException,IOException{
	   // TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);
	   File f1=new File("/home/bridgeit/Pooja/JavaCode/MyFile.txt");
 	   FileReader fr1=new FileReader(f1);
 	   int len=(int)f1.length();
 	   char[] c1=new char[len];
 	   fr1.read(c1);
 	   System.out.println(c1);
 	   String st = new String(c1);
 	   String[] sta = st.split(" ");
 	  
	   LinkedList<String> list = new LinkedList<String>();
	   for (String stng : sta)
       {
           list.add(stng);
           
       }
	   System.out.println(list);//display linked list
	   System.out.println("Enter a word to be search : ");
	   String wrd=sc.nextLine();
	   int position;

		if ((position = list.indexOf(wrd)) == -1) {
			System.out.println("this word is not present ...");
			list.add(wrd);
		} else {
			System.out.println("Word is removing from the list.");
			list.remove(wrd);
		}
		try {
			int len1 = list.size();
			PrintWriter printWriter = new PrintWriter("/home/bridgeit/Pooja/JavaCode/MyFile.txt");
			for (int i = 0; i < len1; i++) {
				String st1 = list.pop();
				printWriter.write(st1 + " ");
			}
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	   }

}
