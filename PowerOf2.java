import java.util.*;
class PowerOf2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=(int)Math.pow(2,i);
System.out.println(a[i]);
}
}
}
