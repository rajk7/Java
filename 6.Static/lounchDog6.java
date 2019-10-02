class Dog
{
	private String name;
	private String color;
	private int cost;
	Dog (String name, String color, int cost)
	{
		this.name = name; //using this
		this.color = color;
		this.cost = cost;
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

class lounchDog6 
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("Tommy","black",5000);
		System.out.println(d1.getName()); //tommy
		System.out.println(d1.getColor());//black
		System.out.println(d1.getCost());//5000

		Dog d2 = new Dog();
		System.out.println(d2.getName()); //error
		System.out.println(d2.getColor());
		System.out.println(d2.getCost());
	}
}