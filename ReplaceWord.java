import java.util.*;

class ReplaceWord{

public static void main(String[] args){
String st1="Hello <<UserName>>, How are you?";
System.out.println(st1);

Scanner sc=new Scanner(System.in);
System.out.println("Enter your appropriate user name ");
String st2=sc.nextLine();

st1=st1.replaceAll("<<UserName>>", st2);
System.out.println(st1);
}
}
