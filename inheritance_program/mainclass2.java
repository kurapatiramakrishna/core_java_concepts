class student
{
	public void School()
	{
		System.out.println("This is super class method:");
	}
}
class teacher extends student
{
	public void admisions()
	{
		School();
	System.out.println("This is sub calss method:");
	}
}

class mainclass2
{
	public static void main(String[] args) 
	{
		teacher rv=new teacher();
        rv.admisions();

	}
}