class lion extends animal
{
	public lion(String selfname,String breed,int wight,String sound,String color) 
	{
		super(selfname,breed,wight,sound,color);
	}
	public void liondetailes()
	{
		int i=1;
		System.out.println((char)i+""+(char)i+""+(char)i+" LION-DETAILES "+(char)i+""+(char)i+""+(char)i);
		System.out.println();
		animaldetailes();
	}
}
