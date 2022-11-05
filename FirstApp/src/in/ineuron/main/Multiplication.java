package in.ineuron.main;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		int [][] m1,m2;
		Scanner input=new Scanner(System.in);
		int nrows1,ncols1,nrows2,ncols2;
		System.out.println("Enter number of rows and columns for Matrix-1:");
		nrows1=input.nextInt();
	    ncols1=input.nextInt();
	    System.out.println("Enter number of rows and columns for Matrix-2:");
	    nrows2=input.nextInt();
		ncols2=input.nextInt();
		
		m1=new int[nrows1][ncols1];
		m2=new int[nrows2][ncols2];
		
		System.out.println("Enter Matrix-1:");
		inputMatrix(m1);
		System.out.println("Enter Matrix-2:");
		inputMatrix(m2);
		
		System.out.println("Matrix-1 is:");
		printMatrix(m1);
		System.out.println("Matrix-2 is:");
		printMatrix(m2);
		
		int result[][]=MultiplicationMatrix(m1,m2);
		
		System.out.println("After Multiplying Matrix-1 and Matrix-2 is:");
		printMatrix(result);
		
	}
	
	public static void inputMatrix(int[][] m)
	{
		Scanner input=new Scanner(System.in);
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				System.out.print("Matrix ["+i+"]["+j+"]=" );
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
				System.out.print(" "+m[i][j]);
			}System.out.println();
		}
	}
    
	public static int[][] MultiplicationMatrix(int[][] m1,int[][] m2)
	{
		int[][] result=new int[m1.length][m2[0].length];
		
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m2[0].length;j++)
			{
//				result[i][j]=0;
				for(int k=0;k<m1.length;k++)
				{
					result[i][j]+=m1[i][k]*m2[k][j];
				}
			}
		}
		return result;
	}
}
