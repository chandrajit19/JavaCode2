// opposite traingle by space with star

class SimplePattern 
{
	public static void main(String[] args) 
	{   
		String s="*";
		
		for(int i=1;  i<=5; i++)
		{  
			
			
				for(int k=1; k<=6-i; k++)
                System.out.print(" ");
			
         
		    for(int j=1;  j<=5; j++) 
			{  
			  System.out.print(s +" ");
			}
             
			 System.out.println();
			
		}
        
	}
}
  