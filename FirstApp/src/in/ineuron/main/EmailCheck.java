package in.ineuron.main;
import java.util.Scanner;

public class EmailCheck {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Email-id:");
		String s1=input.next();
		
		int count=0,count2=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='@')
			{
				count++;
			}
			else if(s1.charAt(i)=='.')
			{
				count2++;
			}
		}
		
		if(count==1 && count2==1)
		{
			System.out.println("It's a valid Email Address.");
			String[] r=s1.split("@");
			System.out.println("Email Id: " + r[0]);
			System.out.println("Email Server Address: "+ r[1]);
		}
		else
		{
			System.out.println("It's Not a valid Email Address!");
		}

	}

}
