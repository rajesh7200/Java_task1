package pgm;

import java.util.Scanner;

public class RevString {
	void reverseString(String s)
	{
		char[] arr=s.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		RevString r1=new RevString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string, to reverse the string");
		String x=sc.nextLine();
		r1.reverseString(x);
	}

}
