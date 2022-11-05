
class A
{
    int i=5;
	
	public void show()
	{
		System.out.println("Hello Aliens!");
	}
}

class B extends A
{
	int i=7;
	
	public void PrintIValue()
	{
		int i=9;
		System.out.println(i); // 9
		System.out.println(this.i); // 7
		System.out.println(super.i); // 5
	}
}

public class Inheritance02 {

	public static void main(String[] args) {
		
		B obj=new B();
		obj.PrintIValue();
		

	}

}
