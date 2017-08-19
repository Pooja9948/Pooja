import java.util.Scanner;  

class Harmonic{
public static void main(String[] args){
double i;
double res=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
double n=sc.nextDouble();
for(i=1;i<=n;i++){
res=(res+(1/i));
}
System.out.println("The result will be :"+res);
}
}
