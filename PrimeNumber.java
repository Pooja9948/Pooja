import java.util.*;
class PrimeNumber{

public static void main(String[] args){
int count=0,i,j;

Scanner scanner=new Scanner(System.in);
System.out.println("Enter 1st number");
int n1=scanner.nextInt();
System.out.println("Enter 2nd number");
int n2=scanner.nextInt();
for(i=n1;i<=n2;i++){
for(j=1;j<=Math.sqrt(i);j++){
    if(i%j==0)
      count++;

}
System.out.println(count+"count");
if(count==2)
System.out.println("number is prime");
else
System.out.println(".....");
}}
}
