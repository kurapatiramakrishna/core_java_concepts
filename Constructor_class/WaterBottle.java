class Bottle
{
	public String bottlename;
	public String bottlecolor;
	public double litters;
	public Bottle(String bottlename,String bottlecolor,double litters)
	{
	this.bottlename=bottlename;
	this.bottlecolor=bottlecolor;
	this.litters=litters;
 }
 public void Display()
	{
	 System.out.println("The bottle name is "+bottlename+" and bottle color is "+bottlecolor+" and bottle capacity is "+litters);
	 System.out.println();
 }
}
class WaterBottle 
{
	public static void main(String[] args) 
	{
		Bottle b1=new Bottle("Bisleri","green",2.25);
		Bottle b2=new Bottle("kinley","yellow",1.25);
		Bottle b3=new Bottle("soda","whight",5.25);
		b1.Display();
		b2.Display();
		b3.Display();
	}
}
