// Right paskal's traingle
class  PaskalTraingle
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=9; i++)
		{	if(i>=1 && i<=5)
	      {
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		  }
		  else
			{
			  for(int k=1; k<=10-i; k++)
				{
				  System.out.print("* ");
				}
                 System.out.println();
			}

		}
	}
}
