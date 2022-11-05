package in.ineuron.main;

public class LaunchArrayForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {10,20,30,40,50};
		
		//For-Each Loop for 1D Array
		for(int element:a)
		{
			System.out.print(element+" ");
		}System.out.println();
		
		
		
		int[][] b= {{10,20,30,40},{50,60,70,80}};
		//For-Each Loop for 2D Array
		for(int []ar:b)
		{
			for(int element:ar)
			{
				System.out.print(element+" ");
			}System.out.println();
		}

	}

}
