class Multiplication 
{
	public static void main(String[] args) 
	{
		System.out.println("MULTIPLICATION PROGRAM!");
		findMultiplication(2,4);
		Multiplication m1=new Multiplication();
		m1.findMultiplication(5.2,6.5);
	}
	public static void findMultiplication( int a,int  b)
	{
		int c=a*b;		
		System.out.println("The multiplication of "+a+" and "+b+" is ="+c);
	}
	public  void  findMultiplication(double a,double b)
	{
		double c=a*b;
			System.out.println("The multiplication of "+a+" and "+b+" is ="+c);
	}
}
