class A
{
	public int i=10;
}
class B extends A
{
	public int j=20;
	public void display()
	{
	System.out.println("This is super class var ="+i);
	System.out.println("This is sub class var ="+i);
	}
}

class mainclass1 
{
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.display();
	}
}
