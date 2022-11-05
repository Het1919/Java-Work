
class Alpha
{
	public void division() throws ArithmeticException
	{
		try {
		System.out.println("Welcome to Eclipse IDE");
		int a=100;
		int b=0;
		int res=a/b;
		System.out.println("The result is "+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handling in division method only.");
			throw e;
		}
		finally {
		    System.out.println("Thank you for using my application");
		}
	}
}
public class LaunchExc01 {

	public static void main(String[] args) {
		
		try {
			Alpha a=new Alpha();
			a.division();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled in main");
		}
		

	}

}
