package in.ineuron.main;
import java.util.Scanner;

public class Matadd {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Size of an matrix:");
		int n=input.nextInt();
		int[][] m1=new int[n][n];
		int [][] m2=new int[n][n];
		
		System.out.println("Enter MAtrix-1");
		inputMatrix(m1);
		System.out.println("Enter MAtrix-1");
		inputMatrix(m2);
		
		System.out.println("Elements of Matrix-1 are Here!");
		printMatrix(m1);
		System.out.println();
		System.out.println("Elements of Matrix-1 are Here!");
		printMatrix(m1);
		System.out.println();
		
		int[][] m3=AddMatrix(m1,m2);
		System.out.println("Addition Matrix are Here!");
		printMatrix(m3);
		System.out.println();
		
	}
	
	public static void inputMatrix(int[][] m)
	{
		Scanner input=new Scanner(System.in);
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				System.out.print("Matrix["+i+"]["+j+"] = ");
				m[i][j]=input.nextInt();
			}
		}
	}
	
	public static void printMatrix(int[][] m)
	{
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				System.out.print(" " + m[i][j]);
			}System.out.println();
		}
	}
	
	public static int[][] AddMatrix(int[][] m1,int[][] m2)
	{
		int[][] result=new int[m1.length][m1[0].length];
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m2.length;j++)
			{
				result[i][j]=m1[i][j]+m2[i][j];
			}
		}
		return result;
	}

}
