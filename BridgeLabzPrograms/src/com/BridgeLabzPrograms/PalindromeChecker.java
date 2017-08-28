package com.BridgeLabzPrograms;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String st;
		    Scanner sc = new Scanner(System.in);
		 
		    System.out.println("Enter a string");
		    st = sc.nextLine();
		 
		    int l  = st.length();
		    int i, begin, end, mid;
		 
		    begin  = 0;
		    end    = l - 1;
		    mid = (begin + end)/2;
		 
		    for (i = begin; i <= mid; i++) {
		      if (st.charAt(begin) == st.charAt(end)) {
		        begin++;
		        end--;
		      }
		      else {
		        break;
		      }
		    }
		    if (i == mid + 1) {
		      System.out.println("Palindrome");
		    }
		    else {
		      System.out.println("Not a palindrome");
		    } 	

	}

}
