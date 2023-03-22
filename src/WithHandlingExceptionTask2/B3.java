package WithHandlingExceptionTask2;

public class B3 
{
	public void m2() throws Exception
	{
		System.out.println("m2   B3  Start");
		Class.forName("A");
		System.out.println("m2   B3  End");
	}

}
