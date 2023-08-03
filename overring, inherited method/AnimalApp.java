class Animal
{
    void eat()
	{
		System.out.println("Animal is eating");
    }
	void sleep()
	{   
		System.out.println("Animal is sleeping");
	}
}

class Tiger extends Animal
{ 
  protected void eat()
	{
		 System.out.println("Tiger is eating");
		
    }
	void roar()
	{   super.eat();
		System.out.println("Tiger is roaring");
	}

}
    class  AnimalApp
{
	public static void main(String[] args) 
	{
		Tiger t=new Tiger();
		t.eat(); // overrifdden
		t.sleep(); // inherited
		t.roar(); // its own method
	 	//super.eat();
		
		
	}
}
