package ReturnTypeFromOneClassToAnother;

public class B 
{
	A a=new A();
	int b=a.m1();
	
	public int m2()
	{
		return b;
	}
	
	

}
