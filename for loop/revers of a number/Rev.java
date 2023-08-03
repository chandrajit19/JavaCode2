import java.util.*;
class  Rev
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.println("Enter the no = ");
	int i=s.nextInt();
	int rev=0;
	for(int org=i;   org>0;)
		{
		rev=(rev*10) + org%10 ;
		org=org/10;
		
		}
System.out.println(rev);
	}
}
