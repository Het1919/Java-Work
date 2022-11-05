class LowBalanceException extends Exception
{
	public String toString()
	{
		return "Balance Should not be less than 5000";
	}
}

public class Exception05 {
	
	static void fun11()
	{
		try {
		     throw new LowBalanceException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
	
	static void fun22()
	{
		fun11();
	}
	static void fun33()
	{
		fun22();
	}

	public static void main(String[] args) {
		
		fun33();

	}

}