import java.util.Scanner;

class UnderAgeException extends Exception
{
	UnderAgeException(String msg)
	{
		super(msg);
	}
}
class OverAgeException extends Exception
{
	OverAgeException(String msg)
	{
		super(msg);
	}
}

class LicenceApplication
{
	private int age;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly Enter your age");
		age=scan.nextInt();
	}
	public void verify() throws UnderAgeException, OverAgeException
	{
		if(age>=18 && age<=60)
		{
			System.out.println("You are eligible");
		}
		else if(age<18)
		{
			throw new UnderAgeException("Dude!. Calm down take it slow kid");
		}
		else
		{
			throw new OverAgeException("Your time is near be carefull");
		}
	}
}

class RTO
{
	void initiate()
	{
		LicenceApplication lApp=new LicenceApplication();
		try
		{
			lApp.input();
			lApp.verify();
		}
		catch(UnderAgeException | OverAgeException e)
		{
			System.out.println(e.getMessage());
			try
			{
				lApp.input();
				lApp.verify();
			}
			catch(UnderAgeException | OverAgeException f)
			{
				System.out.println(f.getMessage());
				System.out.println("Seems suspicious");
				System.exit(0);
			}
		}
	}
}
public class LaunchExp06 {

	public static void main(String[] args) {
		
		RTO r=new RTO();
		r.initiate();

	}

}
