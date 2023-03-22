package WithandwithoutHandlingExceptionTask3;

public class A4 
{
	public void m1()throws Exception
	
	{
		System.out.println("m1  A4  Start");
		B4 b=new B4();
		b.m2();
		System.out.println("m1  A  End");
	}
	public static void main(String args[])
	{
		System.out.println("Main Start");
		A4 a=new A4();
		try
		{
			a.m1();
			System.out.println("Main End");
		}
		catch(Exception e)
		{
			System.out.println("Catch Block="+ e.getMessage());
		}
	}

}
