
public class Exception07 {
	
	static int area(int l,int b) throws Exception
	{
		if(l<0 || b<0)
		{
			throw new Exception();
		}
		return l*b;
	}
	static void method1() throws Exception
	{
	    System.out.println(area(-10,5));
	}

	public static void main(String[] args) {  //throws exception
		
		try {
		    method1();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
