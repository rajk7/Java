class calculator
{
	void add (int x, float y)
	{
		float temp = x+y;
		System.out.println(temp);
	}
	float add (int x, float y, float z)
	{
		return x+y;
	}
}
class lounch2 
{
	public static void main(String[] args) 
	{
		calculator calc = new calculator();
		calc.add(10,20);
	}
}
//method over loading with numaric type promotion
//12-sept