package Abstractclass.task1;

public class Test 
{
	public static void main(String args[])
	{
		B b=new B();       //child class object will call both class method
		b.m1();
		b.m2();
		A a=new B();
		a.m1();            //referance will call only A class method
	}

}
