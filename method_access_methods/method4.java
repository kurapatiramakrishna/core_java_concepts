class method4
{
	public static void main(String[] args) 
	{
		System.out.println("main starts..");
		method4 m1=new method4();
		m1.ball();
		System.out.println("main ends...");
	}
	public  void ball() 
	{
		System.out.println("ball starts..");
		ball1();
		System.out.println("ball ends...");
	}
	public static void ball1() 
	{
		System.out.println("ball1  starts..");

		System.out.println("ball1 ends...");
	}
}