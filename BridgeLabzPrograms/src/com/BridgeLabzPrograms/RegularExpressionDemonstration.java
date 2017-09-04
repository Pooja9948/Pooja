package com.BridgeLabzPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RegularExpressionDemonstration {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		File f1=new File("/home/bridgeit/Pooja/JavaCode/RegularExpression.txt");
	 	   FileReader fr1=new FileReader(f1);
	 	   int len=(int)f1.length();
	 	   char[] c1=new char[len];
	 	   fr1.read(c1);
	 	   System.out.println(c1);
	 	   String st = new String(c1);
	 	 
	 	  System.out.println("Enter your first name ");
	 	  String fnm=sc.nextLine();
	 	  System.out.println("Enter your full name : ");
	 	  String fullname=sc.nextLine();
	 	  System.out.println("Enter your 10 digit mobile no : ");
	 	  String mobno=sc.nextLine();
	 	  System.out.println("Enter current date : ");
	 	  String date=sc.nextLine();
	 	  st=st.replaceAll("<<name>>", fnm);
	 	  st=st.replaceAll("<<full name>>", fullname);
	 	  st=st.replaceAll("xxxxxxxxxx", mobno);
	 	  st=st.replaceAll("01/01/2016", date);
	 	  System.out.println(st);
	}

}
