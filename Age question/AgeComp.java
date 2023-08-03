import java.util.*;
class AgeComp 
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.println("Enter the age of first person = ");
		float a=s.nextFloat();
		System.out.println("Enter the age of Second person = ");
		float b=s.nextFloat();
		System.out.println("Enter the age of third person = ");
		float c=s.nextFloat();

		if((a>b)&&(a>c))
		{
           System.out.println(a + " is oldest");
		}
		if((b>c)&&(b>a))
		{
			System.out.println(b + " is oldest");
		}
		else
		{

           System.out.println(c + " is oldest");
		}

	}
}
