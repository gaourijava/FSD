package practicefromfirst;

public class ThreeMethodsinoneClass 
{
	public void m1()
	{
		System.out.println("Method 1");
	}
	public void m2()
	{
		System.out.println("Method 2");
	}
	public void m3()
	{
		System.out.println("method 3");
	}
	public static void main(String args[])
	{
		System.out.println("Main Start");
		ThreeMethodsinoneClass m=new ThreeMethodsinoneClass ();
		m.m1();
		m.m2();
		m.m3();
		System.out.println("Main End");
	}
}
