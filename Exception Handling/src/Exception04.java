//unchecked exception --> if you can then handle them otherwise compiler will give throw you an Exception.
//import java.io.*;
public class Exception04 {
	
	static void fun1()
	{
		try {
		     System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
//		FileInputStream fi=new FileInputStream("My.txt"); // checked exception--> you must have to handle it otherwise program will give you an exception.
		
	}
	
	static void fun2()
	{
		fun1();
	}
	static void fun3()
	{
		fun2();
	}

	public static void main(String[] args) {
		
		fun3();

	}

}
