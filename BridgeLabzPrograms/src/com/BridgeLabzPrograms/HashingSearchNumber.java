package com.BridgeLabzPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class HashingSearchNumber {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		File f1=new File("/home/bridgeit/Pooja/JavaCode/MyFile1.txt");
 	   FileReader fr1=new FileReader(f1);
 	   int len=(int)f1.length();
 	   char[] c1=new char[len];
 	   fr1.read(c1);
 	   System.out.println(c1);
 	   String st = new String(c1);
 	  String[] sta = st.split(" ");
 	  for (String stng : sta)
      {	
          list.add(Integer.parseInt(stng.trim()));
          
      }
 	  System.out.println("----------");
	  System.out.println(list);//display linked list
	  HashMap<Integer,LinkedList<Integer>> hm=new HashMap<Integer,LinkedList<Integer>>();
	  for(Integer intg : list){
		  int n=intg%11;
		  LinkedList<Integer> ll=hm.get(n);
		  if(ll==null){
			  ll=new LinkedList<Integer>();
			  hm.put(n,ll);
		  }
		  ll.add(intg);
	  }
	  System.out.println(hm);
	  System.out.println("Enter a number to be search");
	  int n1=sc.nextInt();
	  int N=n1%11;
	  hm.get(N);
	  LinkedList<Integer> ll1=hm.get(N);
	  if(ll1==null){
		  ll1=new LinkedList<Integer>();
		  hm.put(N,ll1);
	  }
	  System.out.println(ll1);
	  if(ll1.contains(n1))
		  System.out.println("The number is present in the list");
	  else
		  ll1.add(n1);
	  System.out.println(hm);
	}

}
