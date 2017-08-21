import java.util.*;
class InsertionSort{

public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String st=sc.nextLine();
	char ch[]=new char[st.length()];
	ch=st.toCharArray();
	String st1=" ";
	int i=0;
	for(;i<ch.length;i++)
	{
		int k=i;
		while(i<ch.length && ch[i]!=' ')
		i++;
		int j=i-1;

		if(i<ch.length)
		st1=st1+insSort(st,k,j)+ch[i];
	}
		System.out.println(st);
}

public static String insSort(String st,int k,int j)
{
	char temp;
	char ch[]=st.toCharArray();
	for(;k<=j;k++)
	{
		for(int l=k;l>0;l++)
		{
			if(ch[l]<ch[l-1])
			{
				temp=ch[l];
				ch[l]=ch[l-1];
				ch[l-1]=temp;
			}
		}
	}
	return st;
}
}
