import java.util.Scanner;
class  Formula_problem
{
	public static void main(String[] args) 
	{
		System.out.println("*...FORMULA.*.PROGRAM..*");
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a value:");
		int a=scan.nextInt();
		System.out.println("Enter b value:");
		int b=scan.nextInt();
		System.out.println(" ");
		findCompare(a,b);
	}
	public static void findCompare(int a,int b)
	{
		int lhs=findLhs(a,b);
		int rhs=findRhs(a,b);
		int  compare=lhs=rhs;
		System.out.println("The value of "+a+" and "+b+" is = "+compare);
	}
	public static int findLhs(int a,int b)
	{

		int rhs=findRhs(a,b);
		int lhs=(a*a)+(b*b);
		return lhs;
	}
	public static int findRhs(int a,int b)
	{
		int rhs=((a+b)*(a+b))-(2*a*b);
		return rhs;
	}
}
