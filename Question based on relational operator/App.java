// Question based on realtional operator
class App
{
	public static void main(String args[])
	{
		int x=7, y=11, z=0;
		System.out.println("x==7 ---> " +(x==7));
		System.out.println("x!=11 ---> " +(x!=11));
		System.out.println("x!=11 && y>=12 ---> " +((x!=11) && (y>=12)));
		System.out.println("z!=0 || x==2 ---> " +((z!=0 )|| (x==2)));
		System.out.println("!(y<13) ---> " +(!(y<13)));
	}
}
