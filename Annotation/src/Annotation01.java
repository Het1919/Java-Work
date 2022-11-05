@FunctionalInterface
interface Addition
{
	void add();
//	int add(int a);
}

class Demo
{
	void getInfo()
	{
		System.out.println("Infro in parent");
	}
}

class Demo2 extends Demo
{
	@Override
	void getInfo()
	{
		System.out.println("Overrided succesfully");
	}
}

public class Annotation01 {

	public static void main(String[] args) {
		
		//Below code is adding two numbers.
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		
		Demo2 d = new Demo2();
		d.getInfo();

	}

}
