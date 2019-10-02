class animal
{
	void eat()
	{
		System.out.println("animal is eating");
	}
	void sleep()
	{
		System.out.println("animal is sleeping");
	}
	void breath()
	{
		System.out.println("animal is breathing");
	}
}

class tiger extends animal
{
	void eat()
	{
		System.out.println("tiger is eating");
	}
}

class deer extends animal
{
	void eat()
	{
		System.out.println("deer is eating");
	}
}

class monkey extends animal
{
	void eat()
	{
		System.out.println("monkey is eating");
	}
}

class UML2 
{
	public static void main(String[] args) 
	{
		tiger t = new tiger();
		deer d = new deer();
		monkey m = new monkey();

		t.eat();
		t.sleep();
		t.breath();

		d.eat();
		d.sleep();
		d.breath();

		m.eat();
		m.sleep();
		m.breath();
	}
}
