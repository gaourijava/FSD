package Finallyblock;

public class TestTask4 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		try
		{
			System.out.println("Try Start");
			int i=45/0;
			System.out.println(i);
			System.out.println("Try End");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Catch Block");
		}
		finally
		{
			System.out.println("Final Block");
		}
		System.out.println("Main End");
	}
}
	



