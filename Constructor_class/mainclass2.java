class mainclass1
{
	public mainclass1(boolean a,char b) 
	{
	 System.out.println("This method containes one boolean argument"+a+" and one char argument "+b);	
	}

    public mainclass1(String i,String j,int k) 
	{
		System.out.println("This method containes first strings argument "+i+"and secound string argument "+j+"one integer arguments"+k);
	}

    public mainclass1(double o) 
	{
		System.out.println("This method containes one double arguments"+o);
	}
}
class  mainclass2

{
	public static void main(String[] args) 
	{
	 	mainclass1 m1=new mainclass1(true,'R');
		mainclass1 m2=new mainclass1("good","morning",20);
		mainclass1 m3=new mainclass1(24.10);
		mainclass1 m4=new mainclass1(false,'K');
		mainclass1 m5=new mainclass1("Hi","Ramakrishna",10);
		mainclass1 m6=new mainclass1(15.8);

	}
}
