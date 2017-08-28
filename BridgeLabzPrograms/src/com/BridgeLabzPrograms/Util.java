package com.BridgeLabzPrograms;

import java.util.Calendar;
import java.util.Scanner;

public class Util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dayOfWeek();
		 

	}
	static void dayOfWeek(){
		int gd,gm,gy,ym,yp,d;
	    int[] m=new int[]{0,3,3,6,1,4,6,2,5,0,3,5};
	    String[] wd=new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	    Scanner ip=new Scanner(System.in);
	    System.out.println("Enter Date Month Year \"DD MM YYYY\"");
	    gd=ip.nextInt();
	    gm=ip.nextInt();
	    gy=ip.nextInt();
	    Calendar cal = Calendar.getInstance();
	    cal.set(gy, gm, gd);
	    cal.get(Calendar.DAY_OF_WEEK);
	    ym=gy%100;
	    yp=ym%4;
	    d=(gd+m[gm-1]+ym+yp+1)%7;
	    System.out.print(wd[d]);
		
	}

}
