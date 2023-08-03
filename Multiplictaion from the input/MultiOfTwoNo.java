// "WAJP to take two floating input from user/ keyword and perform multiplication this "
import java.util.Scanner;
class MultiOfTwoNo
{
	public static void main(String args[])
	{   float a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first no = ");
         a=s.nextFloat();
		 System.out.println("Enter the second no = ");
		 b=s.nextFloat();
		 System.out.println(" Product of two floating input is = " +(a*b));
	}

}
