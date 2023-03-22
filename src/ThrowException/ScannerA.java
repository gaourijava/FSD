package ThrowException;

import java.util.Scanner;
public class ScannerA 
{
	public void div(int a,int b)
	{
		if(b==0)
		{
			throw new ArithmeticException("Not use Input Value of B is Zero");
		}
		else
		{
			int c=a/b;
			System.out.println("Value of C="+c);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of A");
		int a=sc.nextInt();
		System.out.println("Enter Value of B");
		int b=sc.nextInt();
		ScannerA s=new ScannerA();
		try
		{
			s.div(a, b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch="+e.getMessage());
		}
	}
	
	

}
