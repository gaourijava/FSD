package Finallyblock;

public class ATask2 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		try
		{
			System.out.println("Try Start");
			String s=null;
			System.out.println(s.length());
			System.out.println("try End");
		}
		catch(Exception e)
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
