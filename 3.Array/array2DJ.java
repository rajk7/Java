import java.util.Scanner;
class array2DJ
{
	public static void main(String[] args) 
	{
		int a[][]= new int[3][4];
			a[0] = new int[3];
			a[1] = new int[2];
			a[2] = new int[4];
		Scanner scan = new Scanner(System.in);
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1 ;j++ )
			{
			System.out.println("Enter the marks of calss "+i+" student "+j);
			a[i][j] = scan.nextInt();
			}
		}
			for (int i=0; i<=a.length-1; i++)
				{
				for (int j=0;j<=a[i].length-1 ;j++ )
					{
				
					System.out.println(a[i][j]);
					}
				}
				
		}

	}
