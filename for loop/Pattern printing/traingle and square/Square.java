class Square
{
	public static void main(String args[])
	{
		int i;
		int j;

		for(i=1; i<=10;  i++)
		{  
			for(j=1; j<=10;  j++)

			{
                  if( ((i==1)||(i==10)) && ((j==1)||(j==10))  )
			      {
				    
                     for(int k=1; k<=10;  k++)
                      {
						 System.out.print("* ");
					  }
                         System.out.println("");

		          }

                   if( ((i==2)||(i==9)) && ((j==2)||(j==9))  )
			      {
				    
                     for(int k=1; k<=10;  k++)
                      {
						 System.out.print("* ");
					  }
                         System.out.println("");

		          }

                     if( ((i==3)||(i==8)) && ((j==3)||(j==8))  )
			      {
				    
                     for(int k=1; k<=10;  k++)
                      {
						 System.out.print("* ");
					  }
                         System.out.println("");

		          }

                     if( ((i==4)||(i==5)) && ((j==4)||(j==5))  )
			      {
				    
                     for(int k=1; k<=10;  k++)
                      {
						 System.out.print("* ");
					  }
                         System.out.println("");

		          }


			}








		}

     }
}