package practicefromfirst;

public class ParameterisedMethod 
{
	public void m1(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void m2(float c,float d)
	{
		float e=c+d;
		System.out.println(e);
	}
	public void m3(double a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void m4(long a,long b)
	{
		long c=a+b;
		System.out.println(c);
	}
	public static void main(String args[])
	{
		ParameterisedMethod p=new ParameterisedMethod ();
		p.m1(10,10);
		p.m2(10.10f,20.10f);
		p.m3(50.25d,90.35d);
		p.m4(10000l,20000l);
	}
	

}
