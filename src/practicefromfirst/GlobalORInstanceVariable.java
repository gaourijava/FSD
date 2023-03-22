package practicefromfirst;

public class GlobalORInstanceVariable 
{
	int a=10;
	int b=10;
	public void add()
	{
		int c=a+b;
		System.out.println("Add of="+  c);
	}
	public void sub()
	{
		int c=a-b;
		System.out.println("Sub of="+  c);
	}
	public void mul()
	{
		int c=a*b;
		System.out.println("Mul of="+  c);
	}
	public void div()
	{
		int c=a/b;
		System.out.println("Div of="+  c);
	}
	public static void main(String args[])
	{
		GlobalORInstanceVariable g=new GlobalORInstanceVariable ();
		g.add();
		g.sub();
		g.mul();
		g.div();
		
	}
}

