import java.util.*;
class ArrayApp 
{
	public static void main(String[] args) 
	{    Scanner s=new Scanner(System.in);
		System.out.println("Please Enter five inegers = ");
		int a[] =new int[5];
		for(int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
		}

        for(int i=0; i<a.length; i++)
		{
		
			if (a[0]<a[i])
			{
				a[0]=a[i];
			}
		}
		System.out.println("the largest integer is " +a[0]);

	}
}
