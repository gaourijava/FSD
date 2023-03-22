package Abstractclass.task4;

public interface Mul 
{
	public abstract int  mul1(int a,int b);
	public int mul2(int a,int b,int c);
	
	public void display();     
	//System.out.println("display method"); //here we cannot give body to display method,
	                                     //because in interface methods 
	                                     //are unimplemented.so we need to override it.
	
		
	

}
