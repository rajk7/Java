import java.util.Scanner;
class Ademo
{
	public static void main(String[] args)
	{
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
		
		class Deom2
		{
			void fun2()
			{
				Deom1 d1 = new Demo1();
				d1.fun1();
			}
		}
		class Demo3
		{
			void fun3()
			{
				Demo2 d2 = new Demo3();
				d2.fun2
			}

		}

		catch (ArithmeticException e)
		{
			System.out.println("enter currect denominater");
		}
		System.out.println("connection terminated");
	}
}
