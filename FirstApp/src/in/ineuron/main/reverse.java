package in.ineuron.main;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=input.nextInt();
		
		int ans=0;
		while(n!=0)
		{
			int rem=n%10;
			ans=ans*10+rem;
			n=n/10;
		}
		
		System.out.println(ans);
	}

}
