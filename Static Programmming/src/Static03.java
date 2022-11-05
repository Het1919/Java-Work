import java.util.Scanner;

class Farmer
{
	private float pa;
	private float td;
	private float si;
	private static float ri;//memory will be allocated only once.
	//static variables=class variables.
	
	static
	{
		ri=2.5f;
	}
	
	public void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Dear, kindly enter loan amount needed");
		pa=scan.nextFloat();
        System.out.println("Dear, kindly enter time needed to repay");
        td=scan.nextFloat();
    }
	
	public void compute()
	{
		si=(pa*td*ri)/100;
	}
	
	public void display()
	{
		System.out.println("Simple Interest is "+ si);
	}
	
}

public class Static03 {

	public static void main(String[] args) {
		
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		
		f1.acceptInput();
		f1.compute();
		f1.display();
		
		f2.acceptInput();
		f2.compute();
		f2.display();
		
	}
}
