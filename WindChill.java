import java.util.*;

class WindChill{

public static void main(String[] args){
double w=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of t and v");
double t=sc.nextDouble();
double v=sc.nextDouble();
if(t<50 && v<120 && v>3)
w= 35.74 + (0.6215*t) + (((0.4275*t)-35.75) * Math.pow(v,0.16));
System.out.println("The value of windchill is : "+w);
}
}
