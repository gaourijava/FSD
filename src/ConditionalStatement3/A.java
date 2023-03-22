package ConditionalStatement3;

import java.util.Scanner;

public class A 
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of weekdays");
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println(1+" "+"Monday" );
		}
		else if(n==2)
		{
			System.out.println(2+" "+"Tuesday" );
		}
		else if(n==3)
		{
			System.out.println(3+" "+"Wednesday" );
		}
		else if(n==4)
		{
			System.out.println(4+" "+"Thursday" );
		}
		else if(n==5)
		{
			System.out.println(5+" "+"Friday" );
		}
		else if(n==6)
		{
			System.out.println(6+" "+"Saturday" );
		}
		else if(n==7)
		{
			System.out.println(7+" "+"Sunday" );
		}
		else
		{
			System.out.println("None" );
		}
	}

}
