import java.util.*;
class StringPermutation{
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String st=sc.nextLine();
        int n = st.length();
        permute(st,0,n-1);
	}
	private static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] ch = a.toCharArray();
        temp = ch[i] ;
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
}