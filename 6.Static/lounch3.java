class calculator
{
	void add (int x, float y)
	{
		float temp = x+y;
		System.out.println(temp);
	}
	float add (float x, int y)
	{
		float temp = x+y;
		System.out.println(temp);
		return x+y;
	}
}
class lounch3
{
	public static void main(String[] args) 
	{
		calculator calc = new calculator();
		calc.add(10.5f,20);
	}
}