class Table
{
	public static void table(int n)
{
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(n+" x "+i+" =" +i*n);
		}
}
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		table(4);
		System.out.println("main ends.!");
	}

}
