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
class airport
{
	void permit(plane ref)
	{
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}

class Polymorphism2
{
	public static void main(String[] args) 
	{
		cargo cp = new cargo();
		passenger pp = new passenger();
		fighter fp = new fighter();
		airport p = new airport();
		p.permit(cp);
		System.out.println("*************************");
		p.permit(pp);
		System.out.println("*************************");
		p.permit(fp);
		
	}
}
