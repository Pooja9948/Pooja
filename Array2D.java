import java.util.*;
class Array2D{
	
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m for 2D array");
        int m=sc.nextInt();
        System.out.println("Enter n for 2D array");
        int n=sc.nextInt();
        System.out.println("Enter x to choose the cases ");
        int x=sc.nextInt();

        switch(x){
            case 1:
                 System.out.println("INTEGER");
                 int a[][]=integer2D(m,n);
                 displayInt(a);
                 break;
            case 2:
                 System.out.println("DOUBLE");
                 double b[][]=double2D(m,n);
                 displayDouble(b);
                 break;
            case 3:
                 System.out.println("BOOLEAN");
                 boolean c[][]=boolean2D(m,n);
                 displayBoolean(c);
                 break;
            default:
                 System.out.println("Invalid Choices");
        }
	}
	public static int[][] integer2D(int m,int n){
		Scanner sc=new Scanner(System.in);
		int[][] data = new int[m][n];
        for(int row=0;row<m;row++){
        	for(int col=0;col<n;col++){
        		System.out.println("Enter elements :");
        		data[row][col] = sc.nextInt();
        		
        	}
        }
        return data;
	}
	public static void displayInt(int a[][]){
		for(int row=0;row<a.length;row++){
			for(int col=0;col<a.length;col++)
			{
				System.out.print(a[row][col]);
			}
			System.out.println();
		}

	}
	public static double[][] double2D(int m,int n){
		Scanner sc=new Scanner(System.in);
		double[][] data = new double[m][n];
        for(int row=0;row<m;row++){
        	for(int col=0;col<n;col++){
        		System.out.println("Enter elements :");
        		data[row][col] = sc.nextDouble();
        		
        	}
        }
        return data;
	}
	public static void displayDouble(double a[][]){
		for(int row=0;row<a.length;row++){
			for(int col=0;col<a.length;col++)
			{
				System.out.print(a[row][col]);
			}
			System.out.println();
		}

	}
	public static boolean[][] boolean2D(int m,int n){
		Scanner sc=new Scanner(System.in);
		boolean[][] data = new boolean[m][n];
        for(int row=0;row<m;row++){
        	for(int col=0;col<n;col++){
        		System.out.println("Enter elements :");
        		data[row][col] = sc.nextBoolean();
        		
        	}
        }
        return data;
	}
	public static void displayBoolean(boolean a[][]){
		for(int row=0;row<a.length;row++){
			for(int col=0;col<a.length;col++)
			{
				System.out.print(a[row][col]);
			}
			System.out.println();
		}

	}
}