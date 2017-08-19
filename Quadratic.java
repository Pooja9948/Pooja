import java.util.*;

class Quadratic{

public static void main(String[] args){
System.out.println("Quadratic equation is a*x*x + b*x + c =0");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a , b , c ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int delta = b*b - 4*a*c;
double x1 = (-b + Math.sqrt(delta))/(2*a);
double x2 = (-b - Math.sqrt(delta))/(2*a);
System.out.println("Root 1 of x : "+x1);
System.out.println("Root 2 of x : "+x2);

}
}
