class Dog
{
	private String name;
	private String color;
	private int cost;
	// there is super() method which have zero constructor 
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

class lounchDog5
{
	public static void main(String[] args) 
	{
		Dog d = new Dog("Tommy","black",10000); // error because constructer have 3 value
		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getCost());
	}
}