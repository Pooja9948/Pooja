import java.util.*;
class TemperatureCoversion{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter f or c");
	    String st=sc.nextLine();
	    if(st.equals("f")){
	    	System.out.println("Temperature in Farenheit");
	    	double f=sc.nextDouble();
	    	double c=((double) f - 32) * 5 / 9;
	    	System.out.println("Farenheit converted to celsius : "+c);
	    }else if(st.equals("c")){
	    	System.out.println("Temperature in Celsius ");
	    	double c=sc.nextDouble();
	    	double f=(((double) c * 9 / 5) + 32);
	    	System.out.println("Celsius converted to farenheit : "+f);
	    }else{
	    	System.out.println("Invalid Character");
	    }
	}
}