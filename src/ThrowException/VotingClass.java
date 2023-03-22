package ThrowException;

public class VotingClass 
{
	public void voting(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible for Vote");
		}
		else
		{
			System.out.println("Welcome to Vote");
		}
	}
	public static void main(String args[])
	{
		VotingClass v=new VotingClass();
		try 
		{
			v.voting(12);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch="+e.getMessage());
		}
	}


}
