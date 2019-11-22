import java.util.Scanner;
class Demo1
{
	void fun1()
	{
		System.out.println("connection established");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value");
		int a = scan.nextInt();
		System.out.println("enter the value");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println(c);
		}
}
		
class Demo2
{
	void fun2()
	{
		Demo1 d1 = new Demo1();
		d1.fun1();
	}
}
class Demo3
{
	void fun3()
	{
		Demo2 d2 = new Demo2();
		d2.fun2();
	}

}

class Exception1
{
	public static void main(String[] args)
	{
	try
	{
		Demo3 d3 = new Demo3();
		d3.fun3();
	}
	catch (ArithmeticException e)
	{
		System.out.println("demmonanater cant be zero");
	}
	}
}

