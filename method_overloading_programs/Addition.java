
class  Addition
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...!");
		add(2,3);
		add(1.2,2.3);
		add(2,4,2.1);
		System.out.println("main starts...!");
	}
	public static void add(int a,int b) 
	{
		System.out.println("addition two integer is...!");
		int c=a+b;
		System.out.println("sum of " +a+" and " +b+ " is= " +c);
	}
	public static void add(double a,double b) 
	{
		System.out.println("addition of two double is...!");
		double c=a+b;
		System.out.println("sum of " +a+ " and "+b+ " is= " +c);

	}
	public static void add(int a ,int b,double c) 
	{
		
		System.out.println("addition of two integer and one double is...!");
		double d=a+b+c;
		System.out.println("sum of " +a+ " and " +b+ " and "+c+" is= " +d);
		
	}
}
