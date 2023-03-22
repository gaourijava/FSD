package Finallyblock;

public class Atask1 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		try
		{
			System.out.println("Try Start");
			int i=Integer.parseInt("123");
			System.out.println(i);
			System.out.println("Try End");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Catch Block");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		System.out.println("Main End");
	}

}
