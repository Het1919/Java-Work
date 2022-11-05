interface Alien1
{
	void disp();
	static void show()
	{
		System.out.println("I am static in interface");
	}
	
	private void shock()
	{
		System.out.println("I am Private");
	}
	
    default void shock2()
	{
		shock();
	}
}

public class Interface05 {
	public static void main(String[] args) {
		
		Alien1.show();

	}

}
