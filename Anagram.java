import java.util.*;

class Anagram{

static String removeSp(String st){
char ch[]=st.toCharArray();
st=" ";
for(int i=0;i<ch.length;i++){
if(ch[i]!=' ')
st=st+ch[i];
}
return st;
}

static String toLower(String st){
char ch[]=st.toCharArray();
st=" ";
for(int i=0;i<ch.length;i++){
if(ch[i]>=65 && ch[i]<=90)
st=st+(char)(ch[i]+32);
else
st=st+ch[i];
}
return st;
}
static String sort(String st){
char ch[]=st.toCharArray();
st=" ";
for(int i=0;i<ch.length;i++){
for(int j=i+1;j<ch.length;j++){
if(ch[i]>ch[j]){
char t=ch[i];
ch[i]=ch[j];
ch[j]=t;
}}
st=st+ch[i];
}
return st;
}
 static boolean compare(String st1,String st2){
char ch1[]=st1.toCharArray();
char ch2[]=st2.toCharArray();
for(int i=0;i<ch1.length;i++)
{
if(ch1[i]!=ch2[i])
return false;
}
return true;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first String");
String st1=sc.nextLine();
System.out.println("Enter second string");
String st2=sc.nextLine();
st1=removeSp(st1);
st2=removeSp(st2);
System.out.println(st1);
System.out.println(st2);
if(st1.length()!=st2.length()){
System.out.println("its not an anagram");
return;
}
st1=toLower(st1);
st2=toLower(st2);
st1=sort(st1);
st2=sort(st2);
boolean res=compare(st1,st2);
if(res)
System.out.println("Entered String is an Anagram");
else
System.out.println("Entered String is not an Anagram");
}
}
