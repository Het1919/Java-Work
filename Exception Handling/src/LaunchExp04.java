//If a parent class method is not throwing any exception,the child class it's not compulsory to throw but it is needed then it can throw any unchecked exception not checked exception.

class Demo2 
{
	void disp() 
	{
		System.out.println("Parent class overridden method");
	}
}
class Demo3 extends Demo2
{
	void disp() throws ArithmeticException
	{
		System.out.println("overriding in child class");
	}
}
public class LaunchExp04 {
	
	public static void main(String[] args) {
		
		Demo3 d=new Demo3();
		d.disp();

	}
	
}

//If a parent class throwing unchecked exception then it is not compulsory to child class also throw but if it's throwing it can throw only unchecked only.
