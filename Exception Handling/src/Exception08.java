
class NegativeDimensionException extends Exception
{
	public String toString()
	{
		return "Dimension can't negative";
	}
}
public class Exception08 {
	
	static int area(int l,int b) throws NegativeDimensionException
	{
		if(l<0 || b<0)
		{
			throw new NegativeDimensionException();
		}
		return l*b;
	}
	
	static void method() throws NegativeDimensionException
	{
		System.out.println(area(10,-4));
	}

	public static void main(String[] args) throws NegativeDimensionException {
		
		method();

	}

}
