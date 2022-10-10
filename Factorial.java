package pgm;

import java.util.Scanner;

public class Factorial {
	int f=1;
	void fact(int no)
	{
	 for (int i = no; i >1; i--)
	  {
		 f=f*i;	
	  }
	 System.out.println("The factorial of "+no+" is "+f);
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number , to see the factorial");
		int x=sc.nextInt();
		Factorial f1=new Factorial();
		f1.fact(x);
	}

}
