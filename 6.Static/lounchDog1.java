class Dog
{
	private String name;
	private String color;
	private int cost;
	void setData(String x, String y, int z)
	{
		name = x;
		color = y;
		cost = z;
	}
	String getName()
	{
		return name;
	}
	String getColor()
	{
		return color;
	}
	int getCost()
	{
		return cost;
	}
}

class lounchDog1 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.setData("Tommy","black",10000);
		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getCost());
	}
}
