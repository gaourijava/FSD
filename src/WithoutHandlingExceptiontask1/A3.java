package WithoutHandlingExceptiontask1;

public class A3 
{
public void m1() throws Exception
{
	System.out.println("m1  A3  Start");
	B3 b=new B3();
	b.m2();
	System.out.println("m1  A3  End");
}
public static void main(String args[])
{
	System.out.println("Main Start");
	A3 a=new A3();
	try
	{
		a.m1();
		System.out.println("Main End");
	}
	catch(Exception e)
	{
		
		System.out.println("Catch Block="+e.getMessage());
	}
	
		
}
}
