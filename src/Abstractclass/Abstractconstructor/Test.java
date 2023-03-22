package Abstractclass.Abstractconstructor;

public class Test 
{
	public static void main(String args[])
	{
		B b=new B();
		System.out.println(b.x);           //object creation of child class
	
	A a=new B();                          //Referance creation    ..............but we should do any one.
	{
		System.out.println(a.x);    
	}
	}
}
