class bag 
{ 
	public String p="pens";
	public void info() 
	{
		System.out.println("a bag containes :"+p);
	}
}
class bag1 extends bag
{
	public void display()
	{
		System.out.println("a bag is used for laptop  storage:");
		info();
   }
}
class bag2 extends bag
{
	public void display1()
	{
		System.out.println("a bag can move anywhere ");
		info();
	}
  } 
class mainclass6
{
	public static void main(String[] args)
	{
		bag1 b1=new bag1();
		bag2 b2=new bag2();
		b1.display();
		b2.display1();
	}
}

