import java.util.Scanner;
class NumberSystem 
{
	public static void main(String[] args)
	{
		System.out.println("binary value");
		String s = Integer.toBinaryString(5);
		System.out.println(s);

		System.out.println("octal value");
		String r = Integer.toOctalString(15);
		System.out.println(r);

		System.out.println("hexadesimal value");
		String t = Integer.toHexString(15);
		System.out.println(t);

		System.out.println("decimal to binary");
		int n = Integer.parseInt("1111",2);
		System.out.println(n);

		System.out.println("decimal to octal");
		int n1 = Integer.parseInt("25",8);
		System.out.println(n1);

		System.out.println("decimal to hexadesimal");
		int n2 = Integer.parseInt("f",16);
		System.out.println(n2);

		System.out.println("binary to hexadesimal");
		int i = Integer.parseInt("101",2);
		String b = Integer.toHexString(i);
		System.out.println(b);

		System.out.println("hexadesimal to binary");
		int i1 = Integer.parseInt("f",16);
		String h = Integer.toBinaryString(i1);
		System.out.println(h);

	}
}
