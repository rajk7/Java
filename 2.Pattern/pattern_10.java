/*
     *
    ***
   *****
  *******
 *********
 *********
 *********
 ***   ***
 ***   ***
 ***   ***
*/
class pattern_10
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=5; i++)
		{
			for (int k=1;k<=5-i+1;k++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=2*i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=5; i++)
		{
			System.out.print(" ");

			for (int j=1; j<=9; j++)
			{
				if ((i==3 || i==4 ||i==5) && (j==4 || j==5 || j==6))
				{
					System.out.print(" ");
				}
				else
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
