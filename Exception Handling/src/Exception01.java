
public class Exception01 {

	public static void main(String[] args) {
		
		int a=10,b=0,c;
		
		try {
		     c=a/b;
		     System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be 0,try again!");
			System.out.println(e);
		}
		System.out.println("Bye");

	}

}
