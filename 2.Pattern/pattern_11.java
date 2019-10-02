/*
    ***
    *** * *
    ****   *
    *** *
    ***   *
   *****     *
  *******       *
 *********        *
 **********       *
  *******   *   *
   *****      
*/
class pattern_11
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=4; i++)
		{
			for (int k=1;k<=4;k++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=3; j++)
			{
				System.out.print("*");
			}
			for (int l=1;l<=5;l++)
			{
				if ((i==2 && l==2)||(i==2 && l==4)||(i==3 && l==1)||(i==3 && l==5)||(i==4 && l==2))
				{
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i=2; i<=5; i++)
		{
			for (int k=1;k<=5-i+1;k++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=2*i-1; j++)
			{
				System.out.print("*");
			}
			for (int l=1;l<=9;l++)
			{
				if ((i==2 && l==4)||(i==3 && l==6)||(i==4 && l==8)||(i==5 && l==9)||(i==5 && l==2))
				{
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i=1; i<=3; i++)
		{
			for (int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=(2*(5-i+1)-1); j++)
			{
				System.out.print("*");
			}
			for (int l=1;l<=9;l++)
			{
				if ((i==1 && l==9)||(i==1 && l==1)||(i==2 && l==4)||(i==2 && l==8))
				{
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
