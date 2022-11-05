
public class Exception02 {

	public static void main(String[] args) {
		
		int[] a= {30,20,10,40,0};
		
		try {
		    int c=a[0]/a[4];
		    System.out.println(c);
		    
		    System.out.println(a[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dision by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index is Invalid");
		}
		System.out.println("Bye");

	}

}
