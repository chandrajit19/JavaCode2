import java.util.*;
class Reverse  
{
	public static void main(String[] args) 
	{   
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int org=s.nextInt();
		int rev=0;
		for(int i=org; org>0; )
		{
			rev=(rev*10) + org%10 ;
			org=org/10;
		}
		System.out.println(" Reverse is  = " +rev);

	}
}
