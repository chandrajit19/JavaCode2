// traingle  star print 
class  Traingle
{
	public static void main(String[] args) 
	{  int i,j,k;
          for(i=0; i<=4; i++)
		  {
		    for(j=1; j<=4-i; j++)
			{
				System.out.print(" ");
			}
			   System.out.print("*");
			  
            if(i>0 && i<4)
			{
			   for(k=1; k<=2*i-1; k++)
			    {
				   System.out.print(" ");
			    }
			System.out.print("*");
			System.out.println();
			}  
				
			if(i==4)
			{
				for(k=0; k<=i; k++)
				{
					System.out.print("* ");
				}
			}
			
			System.out.println();
		}
	}
}
