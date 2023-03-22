package ConditionalStatement7;

public class Number 
{
	public static void main(String args[])
	{


		int a=600;
		int b=500;
		int c=30;
		if(a > b)
		{
			if(a > c)
			{
				System.out.println(a+" "+"Is greater than b and  c" );
			}
			else
			{
				System.out.println(a+" "+"Is not greater than c");
			}
		}
		else if(a < b)
		{
			System.out.println(a+" "+"Is less than b ");
			
		}
		else
		{
			
			System.out.println(a+" "+"Is equal to b and  c");
		}
		
	}

}
