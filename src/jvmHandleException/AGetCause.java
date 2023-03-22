package jvmHandleException;

public class AGetCause 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		try
		{
			System.out.println("Try Start");
			int a=10/0;
			System.out.println("Try End");
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());	
		}
		System.out.println("Main End");
		
	}

}
