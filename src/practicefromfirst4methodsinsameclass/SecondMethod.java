package practicefromfirst4methodsinsameclass;

public class SecondMethod
{
	public void m1()
	{
		System.out.println("m1  A");
	}
	public void m2()
	{
		m1();
		System.out.println("m2 A");
	}
	public void m3()
	{
		m2();
		System.out.println("m3  A");
	}
	public void m4()
	{
		m3();
		System.out.println("m4  A");
	}
	public static void main(String args[])
	{
		SecondMethod s=new SecondMethod();
		s.m4();
		
	}

}
