package in.ineuron.main;
import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=2;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	public static int Fibb(int n)
	{
		if(n==1)
		{
			return 0;
		}
		else if(n==2)
		{
			return 1;
		}
		return Fibb(n-1)+Fibb(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=input.nextInt();
		
		int f=factorial(n);
		System.out.println(f);
		
		int Fib=Fibb(n);
		System.out.println(Fib);
	}

}
