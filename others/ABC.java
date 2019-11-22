import java.io.*;
class ABC 
{
	public static void main(String[] args) throws Exception
	{
		String path1 = "C://Users//hope//Videos//Java//Advance_Java//Input.txt";
		String path2 = "C://Users//hope//Videos//Java//Advance_Java//Output.txt";
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		int temp;
		while ((temp = fr.read())!=-1)
		{
			fw.write(temp);
		}
		fw.flush();
	}
}
