package jvmHandleException;

public class AGet 
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
		catch(Exception e)    //handling Exception in catch by using getMessage();
		{
			System.out.println(e.getMessage());  //divided by zero
		}
		System.out.println("Main End");
	}

}
