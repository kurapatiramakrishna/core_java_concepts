import java.util.Scanner;
class Circle1 
{
	public static void main(String[] args) 
	{
		System.out.println("!..AREA OF THE CIRCLE PROGRAM...!");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the diameter:");
		double diameter=scan.nextDouble();
		findArea(diameter);
	}
	public static void  findArea(double diameter)
	{
		double radius=findRadius(diameter);
		double area=3.14*radius*radius;
		System.out.println("area of the circle is: "+area);
		System.out.println(" ");
	}
	public static double findRadius(double diameter)
	{
   double radius =diameter/2;
   return radius;
	}
}
