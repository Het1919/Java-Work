package in.ineuron.main;

import java.util.Scanner;

public class ArrayCopy {
	
	public static void inputArray(int[] a)
	{
		Scanner input=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=input.nextInt();
		}
	}
	
	public static void copiedArray(int[] a,int[] b)
	{
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
	}
	
	public static void printArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int n=input.nextInt();
		
		int[] a=new int[n];
		int[] b=new int[n];
		
		inputArray(a);
		
		System.out.println("Copied Elements in another array is: ");
		copiedArray(a,b);
		printArray(b);

	}

}
