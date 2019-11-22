import java.io.*;
class FileInputSteam1 
{
	public static void main(String[] args) throws Exception
	{
		String path1 = "C://Users//hope//Videos//Java//Advance_Java//Input.txt";
		String path2 = "C://Users//hope//Videos//Java//Advance_Java//Output.txt";
		FileInputStream fis = new FileInputStream(path1);
		FileOutputStream fos = new FileOutputStream(path2);
		int temp;
		while ((temp = fis.read())!=-1)
		{
			fos.write(temp);
		}
		
	}
}