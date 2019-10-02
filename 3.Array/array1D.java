import java.util.Scanner;
class array1D
{
	public static void main(String[] args) 
	{
		int a[]= new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println("Enter the marks");
			a[i] = scan.nextInt();
		}
			for (int i=0; i<=a.length-1; i++)
				{
				System.out.println(a[i]);
				}
				
		}

	}
