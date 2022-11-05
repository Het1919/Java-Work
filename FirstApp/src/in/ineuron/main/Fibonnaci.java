package in.ineuron.main;
import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<n;i++)
		{
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}

	}

}
