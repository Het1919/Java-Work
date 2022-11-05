package in.ineuron.main;

import java.util.Scanner;

public class LinearSearch {
	
	public static void inputArray(int[] a)
	{
		Scanner input=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=input.nextInt();
		}
	}
	
	public static int LSearch(int[] a ,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n=input.nextInt();
		
		int[] a =new int[n];
		
		System.out.println("Enter elements of an array");
		inputArray(a);
		
		System.out.println("Enter key element to search");
		int key=input.nextInt();
		
		System.out.println(LSearch(a,key));
		

	}

}
