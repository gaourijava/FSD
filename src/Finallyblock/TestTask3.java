package Finallyblock;

public class TestTask3 
{
	public static void main(String args[])
	{
        try
        {
        	System.out.println("Try Start");
		int i=10/0;
		System.out.println(i);
		System.out.println("Try End");
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Catch Block");
        }
        finally
        {
        	System.out.println("Finally Block");
        }
        
       
	}   

}
