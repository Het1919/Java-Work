package in.ineuron.main;
import java.util.Scanner;

public class LaunchArray {

	public static void main(String[] args) {
		
		int []a=new int[5];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Please enter the marks of "+i);
			a[i]=scan.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
