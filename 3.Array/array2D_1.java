import java.util.Scanner;
class array2D_1
{
	public static void main(String[] args) 
	{
		int a[][]= new int[3][4];
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
