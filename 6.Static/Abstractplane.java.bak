abstract class plane
{
	abstract void takeoff();
	abstract void fly();
	abstract void land();
}

class cargo extends plane
{
	void takeoff()
	{
		System.out.println("cargoplane is taking off");
	}
	void fly()
	{
		System.out.println("cargoplane is flying");
	}
	void land()
	{
		System.out.println("cargoplane is landing");
	}
}

class passenger extends plane
{
	void takeoff()
	{
		System.out.println("passengerplane is taking off");
	}
	void fly()
	{
		System.out.println("passengerplane is flying");
	}
	void land()
	{
		System.out.println("passengerplane is landing");
	}
}

class fighter extends plane
{
	void takeoff()
	{
		System.out.println("fighterplane is taking off");
	}
	void fly()
	{
		System.out.println("fighterplane is flying");
	}
	void land()
	{
		System.out.println("fighterplane is landing");
	}
}

class Abstractplane
{
	public static void main(String[] args) 
	{
		cargo t = new cargo();
		passenger d = new passenger();
		fighter m = new fighter();

		t.takeoff();
		t.fly();
		t.land();
		System.out.println("**************************");
		d.takeoff();
		d.fly();
		d.land();
		System.out.println("******************************");
		m.takeoff();
		m.fly();
		m.land();
	}
}
