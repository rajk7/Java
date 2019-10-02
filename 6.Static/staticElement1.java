class user
{
	static int a,b,c;
	int x,y,z;

		static
		{
			a=10;
			b=20;
			c=30;
		}

	{
		x=9;
		y=99;
		z=999;
	}

		static void disp1()  
		{
			System.out.println(x); //static can't access non-static
			System.out.println(y);
			System.out.println(z);
		}

	void disp2()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class staticElement1
{
	public static void main(String[] args) 
	{
	    user.disp1();
		user u1=new user();
		u1.disp2();
	}
}