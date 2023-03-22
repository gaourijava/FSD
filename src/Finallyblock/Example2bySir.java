package Finallyblock;

public class Example2bySir 
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Try start");
			int a=10/2;
			System.out.println("Try End");
		}
		finally
		{
			System.out.println("final Block");
		}
		
	}

}
