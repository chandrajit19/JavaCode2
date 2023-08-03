// Cheaking weather a number is prime or not
import java.util.*;
class CheakPrime
{
	public  static void main(String args[])
	{   int count=0;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a number = ");
		int a=s.nextInt();
		for(int i=1; i<=a; i++)
		{ 
			if(a%i==0)
			{  
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(a + " is a prime no");
		}
		else
		{
			System.out.println("not prime no");
		}


	}
}