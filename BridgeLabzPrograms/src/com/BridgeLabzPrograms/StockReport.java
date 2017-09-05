package com.BridgeLabzPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StockReport {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		int total=0,noofstock=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of all stocks ");
		int n=sc.nextInt();
		StockReport[] sr=new StockReport[n];
		for(int i=0;i<=n;i++){
			sc.nextLine();
			System.out.println("Enter name of stock ");
			String stockname=sc.nextLine();
			System.out.println("No of share ");
			noofstock=sc.nextInt();
			System.out.println("Price of share ");
			double priceofstock=sc.nextDouble();
			//sr[i]=stockname+;
			 //HashMap<K, V> hm=new HashMap<>();
			 //al.addAll(i);
			total=total+noofstock;
			System.out.println("Stock details : "+stockname+" "+noofstock+" "+priceofstock);
		}
		System.out.println("All total no of stocks : "+total);
			/*try {
				
				PrintWriter printWriter = new PrintWriter("/home/bridgeit/Pooja/JavaCode/StockReport.txt");
				
					String st=
					//st1=st1.append(sr[j]);
					printWriter.write(total + " ");
				
				printWriter.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
		File f1=new File("/home/bridgeit/Pooja/JavaCode/StockReport.txt");
	 	   FileReader fr1=new FileReader(f1);
	 	   int len=(int)f1.length();
	 	   char[] c1=new char[len];
	 	   fr1.read(c1);
	 	   System.out.println(c1);
	 	   String st = new String(c1);
	 	   char[] sta=st.toCharArray();*/
	 	   /*String[] arys=" ";
	 	   for (int i = 0; i < sta.length; i++) {
	 		   int k=i;
	 		   while(i<sta.length && sta[i]==','){
	 			   i++;
	 		   }
	 		   int j=i-1;
	 		   while(j>=k){
	 			   arys[l]=arys+sta[j];
	 			   j--;
	 		   }
		}*///= st.split(" ");
	}

}
