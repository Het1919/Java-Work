class NegativeValueException extends Exception
{
	public String toString()
	{
		return "N or P should not be negative";
	}
}

class ZeroException extends Exception
{
	public String toString()
	{
		return "Both Should Not be Zero";
	}
}
class MyCalculator
{
	public long power(int N,int P) throws NegativeValueException ,ZeroException
	{
		if(N<0 || P<0)
		{
			throw new NegativeValueException();
		}
		else if(N==0 && P==0)
		{
			throw new ZeroException();
		}
		return (long) Math.pow(N, P);
	}
}
public class Exeption11 {

	public static void main(String[] args)  {
		
		MyCalculator my=new MyCalculator();
		try {
		      System.out.println(my.power(-2,3));
		}
		catch(NegativeValueException e){
			System.out.println(e);
		}
		catch(ZeroException e)
		{
			System.out.println(e);
		}

	}

}
