package practicefromfirstHierarchicalInheritance;

public class Test 
{
	public static void main(String args[])
	{
		C c=new C();
		c.m1();
		//c.m2();  error because C cannot access property of B child
		c.m3();
		
		B b=new B();
		b.m1();
		b.m2();
		//b.m3(); error because B cannot access property of C
		
		System.out.println(c.x);
		System.out.println(c.z);
		System.out.println(b.y);
		System.out.println(b.x);
	}

}
