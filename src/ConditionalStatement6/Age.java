package ConditionalStatement6;
import java.util.Scanner;

public class Age 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Criteria of Age");
		int a=sc.nextInt();
		if(a>0 && a<18)
		{
			System.out.println("Child");
		}
		else if(a>18 && a<40)
		{
			System.out.println("Young");
		}
		else if(a>=40 && a<=100)
		{
			System.out.println("Old" );
		}
		else if(a==0)
		{
			System.out.println("Not valid age");
		}
		else
		{
			System.out.println("Invalid Age problem");
 
		}
		
		
	
		
	}

}
