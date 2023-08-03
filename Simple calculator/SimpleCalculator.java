import java.util.*;
class SimpleCalculator 
{
	public static void main(String[] args) 
	{   
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the first no = ");
		a=s.nextInt();
		System.out.println("Enetr the seceond no = ");
         b=s.nextInt();
		 System.out.println("addition is = " + (a+b));
		 System.out.println("Substracxtion is = " + (a-b));
		 System.out.println("Multiplication is = " + (a*b));
		 System.out.println("division is = " + (a/b));
	}
}
