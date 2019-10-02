import java.util.*;
class  String1
{
	public static void main(String[] args) 
	{
		StringTokenizer s = new StringTokenizer("ABC for technology traning");
		while(s.hasMoreTokens())
		{
		System.out.println(s.nextToken());
		}
	}
}
