class surname
{
	public void display()
	{
	  System.out.println("hello wolrd");
	}
}
class name extends surname
{
	public void Display()
	{

	}
}
class mainclass6 
{
	public static void main(String[] args) 
	{
		surname a=(surname)new name();
		a.display();
	}
}
