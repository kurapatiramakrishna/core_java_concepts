class dog extends animal
{
	public dog(String selfname,String breed,int wight,String sound,String color) 
	{
		super(selfname,breed,wight,sound,color);
	}
	public void dogdetailes()
	{
		int i=3;
		System.out.println((char)i+""+(char)i+""+(char)i+" DOG-DETAILES "+(char)i+""+(char)i+""+(char)i);
		System.out.println();
		animaldetailes();
	}
}