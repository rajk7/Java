/* output -
child is crying in low voice
child is crying in medium voice
child is crying in heigh voice
*/
class parent
{
	void cry()
	{
		System.out.println("parent is crying");
	}
}
	class child1 extends parent
	{
		void cry()
		{
		System.out.println("child is crying in low voice");
		}
	}
	class child2 extends parent
	{
		void cry()
		{
		System.out.println("child is crying in medium voice");
		}
	}
	class child3 extends parent
	{
		void cry()
		{
		System.out.println("child is crying in heigh voice");
		}
	}

class nonPolymorphism 
{
	public static void main(String[] args) 
	{
		child1 c1 = new child1();
		child2 c2 = new child2();
		child3 c3 = new child3();

		c1.cry();//
		c2.cry();
		c3.cry();
	}
}
