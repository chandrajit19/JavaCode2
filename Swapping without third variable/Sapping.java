// swapping without third or extra variable
class Sapping
{
	public static void main(String args[])
	{
		int a=9, b=3;
        
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("befpre swapping : a=9, b=3 ");
		System.out.println("after swapping  : " + "a= "+a + "b= " +b);
	}

}