import java.io.*;
import java.net.*;
class Server  
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket listenes = new ServerSocket(4000);
		System.out.println("server is ready to listen");
		Socket ssoc = listenes.accept();
		InputStream is = ssoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		String msg = dis.readUTF();
		System.out.println(msg);
	}
}