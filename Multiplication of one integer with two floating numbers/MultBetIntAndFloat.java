// Multiplication in one integer and between two floating number, taking input from user
import java.util.*;
class MultBetIntAndFloat
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println(" First Enter any integer value = ");
		int a=s.nextInt();
		System.out.println("Enter first float number = ");
		float b=s.nextFloat();
		System.out.println("Enter second float value = ");
		float c=s.nextFloat();
		System.out.println("Multiplication is = " + (a*b*c));
	}
}