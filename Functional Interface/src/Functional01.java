@FunctionalInterface
interface Demo
{
	void disp();
}

//lambda expression is for the interface which has one abstract method.

class Alpha implements Demo
{
	public void disp()
	{
		System.out.println("I have given body.");
	}
}
public class Functional01 {

	public static void main(String[] args) {
		
		Demo d=new Alpha();
		d.disp();

	}

}
