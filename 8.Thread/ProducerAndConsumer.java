class Producer extends Thread
{
	Queues a;
	Producer(Queues q)
	{
		a=q;
	}
	public void run()
	{
		int i=1;
		while(true)
		{
			a.put(i++);
		}
	}

}
class Queues
{
	int x;
	void put(int j)
	{
		x=j;
		System.out.println("i have put " + j + "in to x");
	}
	void get()
	{
		System.out.println("i have put " + x + "in to y");
	}
}
class Consumer extends Thread
{
	Queues b;
	Consumer(Queues q)
	{
		b=q;
	}
	public void run()
	{
		while(true)
		{
			b.get();
		}
	}
}

class ProducerAndConsumer 
{
	public static void main(String[] args) 
	{
		Queues q = new Queues();
		(new Producer(q)).start();
		 new Consumer(q).start();
		
		//Producer p = new Producer(q);
		//Consumer c = new Consumer(q);
		
		//p.start();
		//c.start();
	}
}
