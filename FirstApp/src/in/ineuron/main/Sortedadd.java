package in.ineuron.main;
import java.util.Scanner;

public class Sortedadd {

	public static void main(String[] args) {
		
	    int[] m1,m2;
	    Scanner input=new Scanner(System.in);
	    int n,m;
	    
	    System.out.println("Enter Number of elements in array-1:");
	    n=input.nextInt();
	    System.out.println("Enter Number of elements in array-2:");
	    m=input.nextInt();
	    
	    m1=new int[n];
	    m2=new int[m];
	    
	    System.out.println("Enter Array-1:");
	    inputArray(m1);
	    System.out.println("Enter Array-2:");
	    inputArray(m2);
	    
	    
	    int[] m3=mergeArray(m1,m2);
	    System.out.println("Merge Array is:");
	    sort(m3);
	    printArray(m3);
	    

	}
	
	public static void inputArray(int[] m)
	{
		Scanner input=new Scanner(System.in);
		for(int i=0;i<m.length;i++)
		{
			m[i]=input.nextInt();
		}
	}
	
	public static int[] mergeArray(int[] m1,int[] m2)
	{
		int[] m3=new int[m1.length+m2.length];
		int k=0;
		for(int i=0;i<m1.length;i++)
		{
			m3[i]=m1[i];
			k++;
		}
		for(int i=0;i<m2.length;i++)
		{
			m3[k]=m2[i];
			k++;
		}
		
		return m3;
	}
	
	public static void printArray(int[] m)
	{
		for(int i=0;i<m.length;i++)
		{
			System.out.print(m[i]+" ");
		}
	}
	
	public static void sort(int[] m3)
	{
		for(int i=0;i<m3.length-1;i++)
		{
			for(int j=0;j<m3.length-i-1;j++)
			{
				if(m3[j]>m3[j+1])
				{
					int temp=m3[j];
					m3[j]=m3[j+1];
					m3[j+1]=temp;
				}
			}
		}
	}

}
