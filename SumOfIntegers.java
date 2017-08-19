import java.util.*;

class SumOfIntegers
{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++){
for(int j=0;j<a.length;j++){
for(int k=0;k<a.length;k++){
if(a[i]+a[j]+a[k]==0){
System.out.println(a[i]+","+a[j]+","+a[k]+" are of distinct triplets");
}
}
}
}
}
}
