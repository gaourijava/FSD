package ReturnTypeFromOneClassToAnother;

public class C 
{
	B b=new B();
	int c=b.m2();
	
	public int m3()
	{
		return c;
	}
	
}
