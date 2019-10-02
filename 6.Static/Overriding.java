class demo1
{
	public void disp1()//method
	{
		System.out.println("Demo1");
	}
}
class demo2 extends demo1
{
	public void disp()//method
	{
		System.out.println("demo2");
	}
}
class Overriding 
{
	public static void main(String[] args) 
	{
		demo2 d = new demo2();//object calls class 
			d.disp1();//calls method
			d.disp();

	}
}
