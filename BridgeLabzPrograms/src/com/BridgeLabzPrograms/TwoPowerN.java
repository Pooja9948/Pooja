package com.BridgeLabzPrograms;

import java.util.Scanner;

public class TwoPowerN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int N=(int)Math.pow(2, n);
		int a[]=new int[N];
		for(int i=1;i<N;i++){
			a[i]=i;
		}
		boolean b=binarySearch(a,1,N-1,n);
		if(b)
			System.out.println("Number is present with the range ");
		else
			System.out.println("Number is not present with the range ");
	}
	static boolean binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
 
            if (arr[mid] == x)
               return true;
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
            return binarySearch(arr, mid+1, r, x);
        }
        return false;
    }

}
