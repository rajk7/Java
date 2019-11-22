class MSWord extends Thread
{
	public void run()
	{
		if(getName().equals("TYPING"))
		{
			typing();
		}
	
		else if(getName().equals("AUTOSAVE"))
		{
			autosave();
		}
		
		else
		{
			spellcheck();
		}
	}

	void typing()
	{
		try
		{
			for (int i=0;i<=5;i++)
			{
				System.out.println("Typing....");
				Thread.sleep(3000);
			}
		}
		catch (Exception e)
		{
			System.out.println("Typing Terminated");

		}
	}
	void autosave()
	{
		try
		{
			for (; ; )
			{
				System.out.println("autoSave");
				Thread.sleep(3000);
			}
		}
		catch (Exception e)
		{
			System.out.println("autoSave terminated");
		}
	}
	void spellcheck()
	{
		try
		{
			for (; ; )
			{
				System.out.println("spell Checker");
				Thread.sleep(3000);
			}
		}
		catch (Exception e)
		{
			System.out.println("spellCheck terminated");
		}

	}

}
class DoemonThread 
{
	public static void main(String[] args) 
	{
		MSWord ms1 = new MSWord();
		MSWord ms2 = new MSWord();
		MSWord ms3 = new MSWord();

		ms1.setName("TYPING");
		ms2.setName("AUTOSAVE");
		ms3.setName("SPELLCHECK");

		ms2.setPriority(8);
		ms3.setPriority(8);

		ms2.setDaemon(true);
		ms3.setDaemon(true);
		

		ms1.start();
		ms2.start();
		ms3.start();

		
	}
}
