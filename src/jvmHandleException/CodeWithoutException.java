package jvmHandleException;

public class CodeWithoutException 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		try
		{
			System.out.println("Try Start");
			int a=10/2;
			System.out.println(a);
			System.out.println("Try End");
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		System.out.println("Main End");
	}  //here in this code there is no any exception as (10/2=5) so catch block will not 
	   // be printed.
}


