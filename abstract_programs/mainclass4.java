abstract class Tree
{
	abstract public void plant();
}
class Branches extends Tree
{
	public void plant()
	{
		System.out.println("a group of branches is called tree");
	}
}
class Leafs extends Tree
{
	public void plant()
	{
		System.out.println("a group of leafs is called tree");
	}
}
class mainclass4
{
	public static void form(Tree tree)
	{
		tree.plant();
	}
	public static void main(String[] args) 
	{
		form(new Branches());
		form(new Leafs());
	}
}
