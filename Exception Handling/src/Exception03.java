
public class Exception03 {

	public static void main(String[] args) {
		
		int a[]= {30,20,10,40,0};
		
		try {
			try {   
			    int c=a[0]/a[4];
			    System.out.println(c);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Division By Zero");
			}
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index is invalid");
		}
	}

}
