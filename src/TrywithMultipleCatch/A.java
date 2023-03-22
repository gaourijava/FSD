package TrywithMultipleCatch;

public class A 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		try
		{
			String s=args[0];
			int x=Integer.parseInt(s);
			int a=10/x;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOfBoundsException");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormat");
		}
		
	}

}
