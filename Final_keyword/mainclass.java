class Father
{
	final public void marry()
	{
		System.out.println("parents choice");           // error accure in this method why because remove the final keyword
	}
}
class You extends Father
{
	public void marry()
	{
		System.out.println("our choice");
	}
}
class mainclass 
{
	public static void main(String[] args) 
	{
	  You you=new You();
	  you.marry();
	}
}
