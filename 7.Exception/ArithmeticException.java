import java.util.Scanner;
class ArithmeticException
{
	public static void main(String[] args)
	{
		System.out.println("connection established");
		try
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value");
		int a = scan.nextInt();
		System.out.println("enter the value");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println(c);		
		}
		catch (ArithmeticException e)
		{
			System.out.println("enter currect denominater");
		}
		System.out.println("connection terminated");
	}
}
