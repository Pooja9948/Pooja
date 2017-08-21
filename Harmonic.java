import java.util.*;  

class Harmonic{

public static void main(String[] args){

double res=0;
res=harmonicNum(res);
System.out.println("The result will be :"+res);

}

public static  double harmonicNum(double res){
double i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
double n=sc.nextDouble();
for(i=1;i<=n;i++){
res=(res+(1/i));
}
return res;
}
}
