package com.BridgeLabzPrograms;

import java.util.*;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
        int n=sc.nextInt();
        int a[]=toBinary(n);
        //ArrayList<Integer> list = new ArrayList<Integer>();
        //list.add(a);
        swap(a);
	}
    public static int[] toBinary(int n){
    	int binary[] = new int[40];
        int index = 0,count=0;
        while(n > 0){
          binary[index++] = n%2;
          n = n/2;
          count++;
        }
        int x[] = new int[count];
        System.out.println("count : "+count);
        for(int i = index-1;i >= 0;i--){
          x[i]=binary[i];
          System.out.print(binary[i]);
        }
       return x; 
    }
    public static void swap(int a[]){
    	if(a.length>4){
    		int c=a.length;
    		int x[]=new int[2*c];
    	}
    }

}
