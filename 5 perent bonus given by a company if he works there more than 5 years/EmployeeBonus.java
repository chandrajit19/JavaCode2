import java.util.*;
class EmployeeBonus
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year ");
		int a=s.nextInt();
		if(a>5)
		{
			System.out.println("Enter the salry = ");
			float b=s.nextFloat();
			double bonus= (b*5)/100;
			System.out.println("bonus is  = "+ bonus);

         }
		 else
		{
			 System.out.println("You are not eligible = ");
		}



}}