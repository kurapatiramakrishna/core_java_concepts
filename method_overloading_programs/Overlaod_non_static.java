class Overlaod_non_static
{
	public static void main(String[] args) 
	{
		System.out.println("OVERLOAD MAIN METHOD WITH NON- STATIC METHOD!");
		main(5,4);
	}
	public static void main(int a,int b)
	{
		int c=a-b;
		System.out.println("The value of "+a+" and " +b+" is=" +c);
	}
}
