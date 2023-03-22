package ConditionalStatement5;
import java.util.Scanner;

public class Voting 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Age for Voting" );
		int a=sc.nextInt();
		if(a<18)
		{
			System.out.println("Not Eligible for Voting" );
		}
		else
		{
			System.out.println("Eligible for Voting" );
		}
		
	}

}
