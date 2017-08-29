package com.BridgeLabzPrograms;

//import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class UnorderedList {
	
	 static Node head;
	class Node
	{
	    String data;
	    Node next;
	    Node(String new_data)
	    {
	        data = new_data;
	        next = null;
	    }
	}

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
	   for (int i=0; i<sta.length; i++)
       {
           list.push(st);
          // llist.printList();
           //llist.printMiddle();
       }
	   System.out.println(list);//display linked list
	   System.out.println("Enter a word to be search : ");
	   String wrd=sc.nextLine();
	   int count=getCount();
	   boolean b=search(list,wrd,count);
	   System.out.println(b);
	   if(b)
		   delWord();
	   else
	      list.push(wrd);
		   
	}
	public void push(String new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
	static void delWord()
    {
        head = null;
    }
	 public static int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
	}
	static boolean search(LinkedList<String> list,String wrd,int count){
		
		LinkedList curr=list;
		while(curr!=null){
			for(int i=0;i<count;i++){
	         if(curr.element().equals(wrd)) 
	        	 return true;
	    }}
		return false;
	}

}
