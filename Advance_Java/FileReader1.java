import java.io.*;
class FileReader_BufferedReader 
{
	public static void main(String[] args) throws Exception
	{
		String path1 = "C://Users//hope//Videos//Java//Advance_Java//Input.txt";
		String path2 = "C://Users//hope//Videos//Java//Advance_Java//Output.txt";

		FileReader fr = new FileReader(path1);
		BufferedReader br = new BufferedReader(fr); 
		FileWriter fw = new FileWriter(path2);
		BufferedWriter bw = new BufferedWriter(fw);
		String temp;
		while ((temp = br.readLine())!=null)
		{
			fw.write(temp);
		}
		fw.flush();
	}
}
