// find the mord or absolute value of any number   |a|= +a
import java.util.*;
class Mord 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no = ");
		float a=s.nextFloat();
		if(a<0)
		{
		System.out.println(" output is =   " +(-a) );
		}
		else
		{
          System.out.println(" output is =   " +a);
		}
	}
}
