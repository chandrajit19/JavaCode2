import java.util.*;
class  ExamPer
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr no of classes held = ");
		int a=s.nextInt();
		System.out.println("Enetr no of classes taken = ");
		int b=s.nextInt();
		double c=(b*100)/a;     // a & b must be double type or float type if (b/a)*100, because b/a always give integer
		System.out.println("Percentage of classes is = " +c);
		if(c>75)
		{
          System.out.println("You can sit in the exam   ");

	    }
		else
		{
            System.out.println("You can not sit in the exam   ");
	    }
	}
}
