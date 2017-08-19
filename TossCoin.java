import java.util.*;

class TossCoin{

public static String sides;
public static void coin(){
Random rand=new Random();
int sideup = rand.nextInt(2);
if(sideup==0){
sides="heads";
}
else{
sides="tails";
}
}

public static String getSideup(){
System.out.println(sides);
return sides;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of time toss the coin");
int n=sc.nextInt();
int hcnt=0;
int tcnt=0;
for(int i=1;i<=n;i++){
coin();
if(getSideup().equals("heads")){
hcnt++;
}
else{
tcnt++;
}
}
System.out.println("total heads "+hcnt+" and total tails "+tcnt);
}
}
