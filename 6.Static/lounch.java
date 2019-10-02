class lounch 
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c=30;
		float x=10.5f,y=20.5f,z=30.5f;
		double l=15.2,m=25.6,n=35.4;
		calculator calc = new calculator ();
		System.out.println(calc.add(a,b));
		System.out.println(calc.add(a,x,l));
		System.out.println(calc.add(a,x));
	}
}

class calculator
{
	int add (int x, int y)
	{
		return x+y;
	}
	float add (int x, float y)
	{
		return x+y;
	}
	double add (int x, double y)
	{
		return x+y;
	}
	float add (float x, float y)
	{
		return x+y;
	}
	int add (int x, int y, int z)
	{
		return x+y+z;
	}
	double add (int x, float y, double z)
	{
		return x+y+z;
	}
	float add (int x, float y, float z)
	{
		return x+y+z;
	}
	float add (float x, int y)
	{
		return x+y;
	}



}
