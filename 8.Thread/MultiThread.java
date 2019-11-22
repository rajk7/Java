// without Dead-Lock


class Worrior extends Thread
{
	String res1 = "Brahmastra";
	String res2 = "Pashupatastra";
	String res3 = "Sarpastra";
	public void run()
	{
		if(getName().equals("RAMA"))
		{
			resAccRama();
		}
		else
		{
			resAccRavana();
		}
	}
	void resAccRama()
	{
		try
		{
			synchronized(res1)
			{
				System.out.println("Rama has acc " + res1);
				Thread.sleep(3000);
				synchronized(res2)
				{
				System.out.println("Rama has acc " + res2);
				Thread.sleep(3000);
				synchronized(res3)
					{
					System.out.println("Rama has acc " + res3);
					Thread.sleep(3000);
					}
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("Interrefted");
		}
	}

	void resAccRavana()
	{
		try
		{
			synchronized(res1)
			{
				System.out.println("Ravana has acc " + res1);
				Thread.sleep(3000);
				synchronized(res2)
				{
				System.out.println("Ravaana has acc " + res2);
				Thread.sleep(3000);
				synchronized(res3)
					{
					System.out.println("Ravana has acc " + res3);
					Thread.sleep(3000);
					}
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("Interrefted");
		}
	}
}

class  MultiThread
{
	public static void main(String[] args) 
	{
	Worrior w1 = new Worrior();
	Worrior w2 = new Worrior();

	w1.setName("RAMA");
	w2.setName("RAVANA");

	w1.start();
	w2.start();
	}
}
