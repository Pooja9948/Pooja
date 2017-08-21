import java.util.*;

class BubbleSort{

public static void main(String[] args){
int a[]=readArray();
System.out.println("array elements are ");
dispArray(a);
int b[]=sort(a);
dispArray(b);
}
static int[] readArray(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of elements you have :");
int n=sc.nextInt();
int ar[]=new int[n];
System.out.println("Enter "+n+" elements");
for(int i=0;i<n;i++)
ar[i]=sc.nextInt();
return ar;
}
static void dispArray(int ar[]){
for(int i=0;i<ar.length;i++)
System.out.print(ar[i]+" ");
System.out.println();
}
static int[] sort(int ar[]){
for(int i=0;i<ar.length;i++){
for(int j=i+1;j<ar.length;j++){
if(ar[i]>ar[j]){
int temp=ar[i];
ar[i]=ar[j];
ar[j]=temp;
}
}
}
return ar;
}
}
