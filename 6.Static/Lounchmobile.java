class OS 
{
	String name;
	OS(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
}

class charger
{
	String brand;
	charger(String brand)
	{
		this.brand = brand;
	}
	String getBrand()
	{
		return brand;
	}
}

class mobile
{
	OS os = new OS("android");
	void hasA(charger c)
	{
		System.out.println(c.getBrand());
	}
}

class Lounchmobile 
{
	public static void main(String[] args) 
	{
		mobile m = new mobile();
		charger c = new charger("nokia");
		System.out.println(m.os.getName());
		System.out.println(c.getBrand());
		m.hasA(c);
		m = null;
		System.out.println(c.getBrand());
	}
}
