// 1. a).byte b).short c).int d).long
// 2. char
// 3. double /float
// 4. audio
// 5. image
// 6. video 
class  dataType
{
	public static void main(String[] args) 
	{
		int n = 10;

		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (j==0&&i<=n/2)
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
