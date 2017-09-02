package com.BridgeLabzPrograms;

import java.util.LinkedList;
import java.util.Scanner;

class Stack
{
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
 
    boolean isEmpty()
    {
        return (top < 0);
    }
    Stack()
    {
        top = -1;
    }
 
    boolean push(int x)
    {
        if (top >= MAX)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
}
public class PrimeStack {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack s = new Stack();
		int sizeOfStack=0;
		for(int i=0;i<=10;i++){
			System.out.println("Enter number to be push ");
			int n=sc.nextInt();
			sizeOfStack++;
			s.push(n);
		}
		
        System.out.println("Anagram in given range of prime numbers are:");
        for (int i = 0; i < sizeOfStack; i++) {
        	/*int x=s[i].intvalue();
        	int y=s[i+1].intvalue();
			if (checkAnagram(x,y)) {
				System.out.println(x + "  " + y);
			}*/
		}
	}
	 /*public static int getCount()
	    {
	        Node temp = first;
	        int count = 0;
	        while (temp != null)
	        {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	}*/
	public static boolean checkAnagram(int string1 , int string2){
		/*if(string1.length()!=string2.length())
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
		}*/
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
	 /*public void display()
	    {
	        Node current=first;
	        while(current!=null)
	        {
	            System.out.print(" "+current.data);
	            current=current.next;
	        }
	        System.out.println("");
	    }
*/
}
