package jvmHandleException;

public class APrintStackTrace 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		try
		{
			System.out.println("Try Start");
			int a=10/0;
			System.out.println(a);
			System.out.println("Try End");
		}
		catch(Exception e)
		{
			e.printStackTrace();   //This is void method of exception,so no need of writing
			                     //System.out.println();.
		}    //This method tells in detail where and why exception has occur.
		System.out.println("Main End");
	}

}
