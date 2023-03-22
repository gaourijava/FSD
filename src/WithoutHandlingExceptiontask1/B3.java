package WithoutHandlingExceptiontask1;

public class B3 
{
	public void m2()throws Exception
	{
		System.out.println("B3  m2 Start");
		Class.forName("A");
		System.out.println("B3   m2 End");
	}

}
