package com.BridgeLabzPrograms;

import java.util.LinkedList;

class Node
{
    public int data;
    public Node next;
    public Node(int x)
    {
        data=x;
    }
    public void display()
    {
        System.out.println(data+" ");
    }
}	
public class PrimeQueue {

	 public void insertLast(int x)
	    {
	        Node newNode=new Node(x);
	        newNode.next=null;
	        if(isEmpty())
	            first=newNode;
	        else
	            last.next=newNode;
	        last=newNode;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeStack ps=new PrimeStack();
		int limit = 1000;
		LinkedList<String> l = new LinkedList<String>();

	}
	 public int getCount()
	    {
	        Node temp = first;
	        int count = 0;
	        while (temp != null)
	        {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	}
	 public boolean anagram(String string1 , String string2){
		if(string1.length()!=string2.length())
		{
			return false;
		}
		char[] a = string1.toCharArray();
		sort(a);
		char[] b = string2.toCharArray();
		sort(b);
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=b[i])
			{
				return false;
			}
		}
		return true;
	}
	 public static void sort(char[] ab){
			for(int i=0;i<ab.length;i++){
				for(int j=i+1;j<ab.length;j++){
					if(ab[i]>ab[j]){
						char temp=ab[i];
						ab[i]=ab[j];
						ab[j]=temp;
					}
				}
			}
		}
}
