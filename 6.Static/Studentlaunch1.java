class heart 
{
	int heartbeat;
	heart(int heartbeat)
	{
		this.heartbeat = heartbeat;
	}
	int getHeartbeat()
	{
		return heartbeat;
	}
}

class brain
{
	int iq;
	brain(int iq)
	{
		this.iq = iq;
	}
	int getIq()
	{
		return iq;
	}
}

class books
{
	int page;
	books(int page)
	{
		this.page = page;
	}
	int getPage()
	{
		return page;
	}
}

class bike
{
	int milage;
	bike(int milage)
	{
		this.milage = milage;
	}
	int getMilage()
	{
		return milage;
	}
}
class Human
{
	heart he = new heart(75);
	brain br = new brain(100);
	
}
class student extends Human
{
	void hasA(books bo)
	{
		System.out.println(bo.getPage());
	}
	void hasA(bike bi)
	{
		System.out.println(bi.getMilage());
	}
}

class Studentlaunch1
{
	public static void main(String[] args) 
	{
		student s = new student();
		books bo = new books(76);
		bike bi = new bike(107);
		System.out.println(s.he.getHeartbeat());
		System.out.println(s.br.getIq());
		s.hasA(bo);
		s.hasA(bi);
		s = null;
		System.out.println(bo.getPage());
		System.out.println(bi.getMilage());
		//s.hasA(bo);
		//s.hasA(bi);

	}
}
