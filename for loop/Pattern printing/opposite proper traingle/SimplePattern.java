// opposite proper traingle 

class SimplePattern 
{
	public static void main(String[] args) 
	{   
		String s="*";
		
		for(int i=0;  i<5; i++)
		{  
			  for(int j=1;  j<=(9-2*i); j++) 
			{  
			  System.out.print(" " +s);
			}
			System.out.println();

				for(int k=0; k<=i; k++)
                System.out.print("  ");
			
         
		   
			
		}
        
	}
}
  