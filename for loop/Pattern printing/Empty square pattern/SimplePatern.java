// empty  square pattern 
class SimplePatern 
{
	public static void main(String[] args) 
	{   
		String s="*";
		
		for(int i=1;  i<=5; i++)
		{  
			if(i==1)
			{
			
                for(int j=1;  j<=5; j++) 
			    {
		         System.out.print(s +"  ");
			    }
			     System.out.println();
			}

            
	    	else if(i>=2 && i<=4)
			{
				 
			     {
		           System.out.print(s +"           "+s);
			     }
				 System.out.println();
			}
			
			 
			 else
				{
                 for(int j=1;  j<=5; j++) 
			      {
		            System.out.print(s +"  ");
			       }
			    }

			
		}
        
	}
}  
