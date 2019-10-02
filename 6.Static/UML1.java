class plane
{
	void takeoff()
	{
		System.out.println("plane is taking off");
	}
	void fly()
	{
		System.out.println("plane is flying");
	}
	void land()
	{
		System.out.println("plane is landing");
	}
}

class cargo extends plane
{
	void fly()
	{
		System.out.println("plane is flying low");
	}
}

class passenger extends plane
{
	void fly()
	{
		System.out.println("plane is flying medium");
	}
}

class fighter extends plane
{
	void fly()
	{
		System.out.println("plane is flying very high");
	}
}

class UML1 
{
	public static void main(String[] args) 
	{
		cargo t = new cargo();
		passenger d = new passenger();
		fighter m = new fighter();

		t.takeoff();
		t.fly();
		t.land();

		d.takeoff();
		d.fly();
		d.land();

		m.takeoff();
		m.fly();
		m.land();
	}
}
