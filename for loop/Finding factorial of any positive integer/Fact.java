// find  factorial of any positive integer
import java.util.*;
class Fact 
{   
	public static void main(String[] args) 
	{ Scanner s=new Scanner(System.in);
	System.out.println("Enter positive  integer = ");
	int a=s.nextInt();
	 int fact=1;
	for(int i=0; i<a; i++)
		{
         fact*=(a-i);      // fact=fact*a,   both are same
		}
         System.out.println(fact);
	}
	
}
