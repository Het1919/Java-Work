package in.ineuron.main;

public class Question1 {

	public static void main(String[] args) {
		
		int n=9;
		
		System.out.println();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==(n-1) || j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print("\t");
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==(n-1) || i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print("\t");
			
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==(n-1) || i==(n-1)/2 || j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print("\t");
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==(n-1) || i==(n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print("\t"); 
			
		      int half=(n-1)/2;
		      System.out.printf("*");
		        for (int j = 0; j < n; j++)
		        {
		            if ((i == 0 || i == half)
		                && j < (n - 2))
		                System.out.printf("*");
		            else if (j == (n - 2)
		                    && !(i == 0 || i == half))
		                System.out.printf("*");
		            else
		                System.out.printf(" ");
		        }
		        System.out.print("\t");
			
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==(n-1) || j==0 || j==(n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print("\t");
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==(n-1) || i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
			
		}

	}

}
