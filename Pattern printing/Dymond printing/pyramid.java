// dymond printing
class  pyramid
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=10; i++)
			
		if(i>=1 && i<=5)
		{
			for(int j=1; j<=6-i; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	  else
		{  for(int j=1; j<=i-5; j++)
			{
		      System.out.print("* ");
			}
			
		  System.out.println();
		}
		

	}
}
