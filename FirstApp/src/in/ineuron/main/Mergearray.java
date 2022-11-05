package in.ineuron.main;
import java.util.Scanner;

public class Mergearray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] a1,a2;
		System.out.println("Enter size of first-Array");
		int n1=input.nextInt();
		System.out.println("Enter size of second-Array");
		int n2=input.nextInt();
		
		a1=new int[n1];
		a2=new int[n2];
		
		System.out.println("Enter the elemnet of first array");
		inputArray(a1);
		System.out.println("Enter the elemnet of second array");
		inputArray(a2);
		
		System.out.println("Your array-1 is here");
		printArray(a1);
		System.out.println();
		System.out.println("Your array-2 is here");
		printArray(a2);
		System.out.println();
		
		int[] a3=mergeArray(a1,a2);
		System.out.println("Your array-3 before sorted is here");
		printArray(a3);
		System.out.println();
		
		sortedArray(a3);
		System.out.println("Your array-3 after sorted is here");
		printArray(a3);
		System.out.println();

	}
	
	public static void inputArray(int[] a)
	{
		Scanner input=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Array["+i+"] = ");
			a[i]=input.nextInt();
		}
	}
	
	public static void printArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static int[] mergeArray(int[] a1,int[] a2)
	{
		int x1=a1.length;
		int x2=a2.length;
		int[] result=new int[x1+x2];
		int k=0;
		for(int i=0;i<x1;i++)
		{
			result[k]=a1[i];
			k++;
		}
		for(int j=0;j<x2;j++)
		{
			result[k]=a2[j];
			k++;
		}
		return result;
	}
	
	public static void sortedArray(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
				   int temp=a[j];
				    a[j]=a[j+1];
				    a[j+1]=temp;
				}
			}
		}
	}
}
