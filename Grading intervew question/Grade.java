import java.util.*;
class Grade 
{
	public static void main(String[] args) 
	{   
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr your marks = ");
		float a=s.nextFloat();
		if(a<35)
		{
			System.out.println("Your grade is =F "+a);
		}
		if((35<a) && (a<45))
		{
          System.out.println("Your grade is =E "+a);
		}
		if((45<a) && (a<50))
		{
			System.out.println("Your grade is =D "+a);
		}
		if((50<a) && (a<60))
		{
			System.out.println("Your grade is =C " +a);
		}
		if((60<a) && (a<80))
		{
			System.out.println("Your grade is =B "+a);
		}
		if(80<a)
		{
			System.out.println("Your grade is =A "+a);

		}
	}
}
