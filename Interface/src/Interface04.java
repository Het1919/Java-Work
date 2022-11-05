interface Demo1
{
	void disp();
	default void show()
	{
		System.out.println("Hello i am in interface");
	}
}

class Alien implements Demo1
{
	public void disp()
	{
		System.out.println("Implementing display method");
	}
	public void show()
	{
		System.out.println("Hey i am in show method");
	}
}

public class Interface04 {

	public static void main(String[] args) {
		
		Demo1 d=new Alien();
		d.disp();
		d.show();

	}

}
