import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		String string=insertionSort(str);
		System.err.println("Sorted String:");
		string =string.substring(1, string.length()-1).replaceAll(",","");
		System.out.println(string);
		
	}
	public static String insertionSort(String str) {

		String[] sting = str.split(" ");
		for (int j = 0; j < sting.length; j++) {
			int i = 0;
			String key = sting[j];
			i = j - 1;
			while (i >= 0) {
				if (key.compareTo(sting[i]) > 0) {
					break;
				}
				sting[i + 1] = sting[i];
				i--;
			}
			sting[i + 1] = key;
		}
		return Arrays.toString(sting);
	}
}