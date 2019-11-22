import java.util.Scanner;
class AsciiToInt 
{
	public static void main(String[] args)
	{
		System.out.println("enter Ascii value and gets int number");
		Scanner scan = new Scanner(System.in);
		char a = scan.next().charAt(0);
		System.out.println((int)a);
	}
}
