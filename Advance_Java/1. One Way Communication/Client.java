import java.util.*;
import java.io.*;
import java.net.*;
class Client  
{
	public static void main(String[] args) throws Exception 
	{
		Socket csoc = new Socket("localhost", 4000);
		OutputStream os = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner scan = new Scanner(System.in);
		String msg = scan.nextLine();
		dos.writeUTF(msg);
	}
}
