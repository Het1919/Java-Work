package in.ineuron.main;
import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		
		int[][] m1,m2;
		Scanner input=new Scanner(System.in);
		int nrows,ncols;
		
		System.out.println("Enter Number of rows");
		nrows=input.nextInt();
		System.out.println("Enter Number of columns");
		ncols=input.nextInt();
		
		m1=new int[nrows][ncols];
		m2=new int[nrows][ncols];
		
		System.out.println("Enter Matrix-1");
		inputMatrix(m1);
		System.out.println("Enter Matrix-2");
		inputMatrix(m2);
		
		System.out.println("Matrix-1:");
		printMatrix(m1);
		System.out.println("Matrix-2:");
		printMatrix(m2);
		
		System.out.println("Addition of matrix-1 and matrix-2 is:");
		int result[][]=Addition(m1,m2);
		printMatrix(result);
		
	}
	
	public static void inputMatrix(int[][] m)
	{
		Scanner x=new Scanner(System.in);
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				System.out.print("Matrix ["+i+"]["+j+"]"+" = ");
				m[i][j]=x.nextInt();
			}
		}
	}
	
	public static void printMatrix(int[][] m)
	{
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				System.out.print(" "+m[i][j]);
			}System.out.println();
		}
	}
	
	public static int[][] Addition(int[][] m1,int[][] m2)
	{
		int result[][]=new int[m1.length][m1[0].length];
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1[0].length;j++)
			{
				result[i][j]=m1[i][j]+m2[i][j];
			}
		}
		return result;
	}

}
