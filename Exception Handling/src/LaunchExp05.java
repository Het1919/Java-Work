import java.util.Scanner;

class InValidUserException extends Exception
{
     InValidUserException(String msg)
     {
    	 super(msg);//calling the parent class constructor-->Exception.
     }
}

class ATM
{
	private int accountNum=1111;
	private int password=2222;
	private int accN;
	private int pw;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the account Number");
		accN=scan.nextInt();
		System.out.println("Enter the password");
		pw=scan.nextInt();
	}
	
	public void verify() throws InValidUserException
	{
		if(accountNum==accN && password==pw)
		{
			System.out.println("Collect your cash");
		}
		else
		{
			/*
			InValidUserException iue=new InValidUserException();
			System.out.println("Invalid credentials");
			throw iue;
			*/
			
			throw new InValidUserException(" Invalid credentials! ");	
		
		}
	}
}

class Bank
{
	public void initiate()
	{
		ATM a=new ATM();
		try {
			a.input();
			a.verify();
		}
		catch(InValidUserException e)
		{
		    try {
		    	System.out.println(e.getMessage());
		    	a.input();
		    	a.verify();
		    }
		    catch(InValidUserException f)
		    {
		    	try {
		    		System.out.println(f.getMessage());
			    	a.input();
			    	a.verify();
			    }
			    catch(InValidUserException g)
			    {
			    	System.out.println("Your Card is Blocked!");
			    	System.exit(0);
			    }
		    }
		}
	}
}
public class LaunchExp05 {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.initiate();

	}

}
