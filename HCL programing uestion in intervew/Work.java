//   HCL Programming Question 
import java.util.*;
class Work
{
	public static void main(String[] args) 
	{  
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr your age = ");
		int age=s.nextInt();
		System.out.println("Enetr your gender m or f = ");
		String gender =s.next();
        System.out.println("Enetr your martial status y or n = ");
		String marital =s.next();
     if(gender.equals("f"))
		{  
		  
		    if(marital.equals("y"))
			{ 
				 System.out.println("marride");
				 System.out.println("She will work in urban area ");
			}
			else if(marital.equals("n"))
			{ 
				 System.out.println("unmarride");
				 System.out.println("She will work in urban area ");
			}
			else
			{
                System.out.println("error");
			}
		}
	else if(gender.equals("m"))
		{
			if((age>20)&& (age<40))
			{  
				
                if(marital.equals("y"))
			    { 
				System.out.println("marride");
				System.out.println("he will work anywhere ");
			    }
			   else if(marital.equals("n"))
		    	{ 
				System.out.println("unmarride");
				System.out.println("he will work anywhere ");
			    }
				else
				{
                 System.out.println("error");
				}
            }

			else if((age>40)&&(age<60))
			{
				

				if(marital.equals("y"))
			    { 
				System.out.println("marride");
				System.out.println("he will work urban area ");
			    }
			    else if(marital.equals("n"))
			    { 
				System.out.println("unmarride");
				System.out.println("he will work urban area ");
			    }
				else
				{
                 System.out.println("error");
				}

			}

		else
		       {
			   System.out.println("error");
               }

		}	
		else
		{
			System.out.println("error");

		}

      
	
}
}