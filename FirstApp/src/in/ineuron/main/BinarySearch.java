package in.ineuron.main;

import java.util.Scanner;

public class BinarySearch {
	
	public static void inputArray(int[] a)
	{
		Scanner input=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=input.nextInt();
		}
	}
	
	public static int BSearch(int[] a,int key)
	{
		int l=0;
		int h=a.length-1;
		int mid;
		
		while(l<=h)
		{
			mid=l+(h-l)/2;
			if(a[mid]==key)
			{
				return mid;
			}
			else if(a[mid]<key)
			{
				l=mid+1;
			}
			else
			{
				h=mid-1;
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
		
		System.out.println(BSearch(a,key));

	}

}
