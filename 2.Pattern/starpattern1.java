/*
          *
         ***
        *****
       *******
      *********
     ***********
     ***********
     ***********
     ***********
     ***********
     ***********
     ***********
     ***********
     ***********
     ***********
     ***********
    *************
   ***************
  *****************
 *******************
*********************
*/
class  starpattern1
{
	public static void main(String[] args) 
	{
		int n =21;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (j>=n-1-i&&j<=i||j>=n/2-i&&j<=n/2+i&&j>=n/4&&j<=3*n/4&&j<=n/2+i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}