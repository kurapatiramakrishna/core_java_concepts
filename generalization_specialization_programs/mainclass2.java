class Shape
{												// generalization program
	public void rotate()
	{
		System.out.println("rotate in clock wise");
	}
	public void fill()
	{
		System.out.println("fill with ble color");
	}
	public void outline()
	{
		System.out.println("outline thinkness");
	}
}
class Circle extends Shape
{
}

class Rect extends Shape
{
}
class Tria extends Shape
{
}
class mainclass2
{
	public static void dispaly(Shape shape)
	{
	shape.rotate();
	shape.fill();
	shape.outline();
	}
	public static void main(String[] args) 
	{
		dispaly(new Circle());
		System.out.println();
		dispaly(new Rect());
		System.out.println();
		dispaly(new Tria());

	}
}
