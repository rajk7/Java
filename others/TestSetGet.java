class TestSetGet 
{
	int price;
		void setDog(int cost)
		{
			price=cost;
		}

		int getDog()
		{
			return price;
		}
	public static void main(String[] args) 
	{
		TestSetGet a = new TestSetGet();
		a.setDog(20);
		System.out.println(a.getDog());
	}
}
