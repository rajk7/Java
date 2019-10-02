class farmer
{
	float p,t,r,si;
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the principle amount");
		p = scan.nextFloat();

		System.out.println("enter the time");
		t = scan.nextFloat();
		r = 2.0f;
	}

	void compute()
	{
		si = (p*r*t)/100;
	}

	void display()
	{
		System.out.println(si);
	}
}

class withoutStatic 
{
	public static void main(String[] args) 
	{
		farmer f1 = new farmer();
		farmer f2 = new farmer();
		farmer f3 = new farmer();
		
		f1.input();
		f2.input();
		f3.input();

		f1.compute();
		f2.compute();
		f3.compute();

		f1.display();
		f2.display();
		f3.display();
		}
}
