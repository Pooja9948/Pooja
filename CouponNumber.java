import java.util.*;
class CouponNumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

String st="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
char ch[]=st.toCharArray();

	int rndm=(int)Math.random();
	for(int i=0;i<5;i++){
		if(rndm==ch[i])
			System.out.println("Number already present");
		else
			System.out.println("Distinct Number");
    
  }
}
}
