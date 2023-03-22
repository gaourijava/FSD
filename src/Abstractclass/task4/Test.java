package Abstractclass.task4;

public class Test implements Mul
{
	public int mul1(int i1,int i2)
	{
		return i1*i2;
	}
	public int mul2(int i1,int i2,int i3)
	{
		return i1*i2*i3;
	}
	public void display()
	{
		System.out.println("Display method");    
	}
	
	public static void main(String args[])
	{
		Mul m=new Test();
		System.out.println(m.mul1(3, 7));
		System.out.println(m.mul2(1, 9, 1));  
		m.display();
	}
	public int m1() {
		// TODO Auto-generated method stub
		return 0;
	}
}
