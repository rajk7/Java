class  Array3D1
{
	public static void main(String[] args) 
	{
		int a[][][] ={{{1,2,3,4},{5,6,7},{8,9}}};
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
				for (int k=0;k<=a[i][j].length-1;k++)
				{
					System.out.println(a[i][j][k]);
				}
			}
		}
	}
}