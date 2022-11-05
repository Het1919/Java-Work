package in.ineuron.main;
import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=input.nextInt();
		int sum=0;
		
		while(n!=0)
		{
			sum+=n%10;
			n=n/10;
		}
		
		System.out.println(sum);
	}

}
