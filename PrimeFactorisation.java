import java.util.*;

class PrimeFactorisation{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
for(int i=1;i<=n;i++){
if(n%i==0){
boolean a= checkPrime(i);
if(a)
System.out.println(i+" is a primefactorial number");
}
}
}

public static boolean checkPrime(int x){
int count=0;
for(int i=1;i<=x;i++){
if(x%i==0)
count++;
}
if(count==2)
return true;
return false;
}

}
