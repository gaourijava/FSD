package ConditionalStatement4;
import java.util.Scanner;

public class Marks 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks");
		int m=sc.nextInt();
		if(m<33)
		{
			System.out.println("Fail");
		}
		else if(m>33 && m<60)
		{
			System.out.println("Pass" );
		}
		else if(m>60 && m<74)
		{
			System.out.println("Top" );
		}
		else if(m>=75)
		{
			System.out.println("Distinction" );
		}
		else
		{
			System.out.println("No result");
		}
	}

}
