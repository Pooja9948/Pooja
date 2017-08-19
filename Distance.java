import java.util.Scanner;

class Distance{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter X command line argument");
int x=sc.nextInt();
System.out.println("Enter Y command line argument");
int y=sc.nextInt();
double res=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
System.out.println("The euclidean distance is :"+res);
}
}
