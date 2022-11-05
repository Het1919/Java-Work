class Alpha extends Thread
{
	public void run()
	{
		String s=Thread.currentThread().getName();
		
		if(s.equals("BANK"))
		{
			banking();
		}
		else if(s.equals("PRINT"))
		{
			printing();
		}
		else
		{
			calc();
		}
	}
	
	public void banking()
	{
		System.out.println("Banking task Started");
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Banking.........");
		}
	   System.out.println("Banking completed....");
	}
	
	public void printing()
	{
		System.out.println("Printing task Started");
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Printing.........");
		}
	   System.out.println("Printing completed....");
	}
	
	public void calc()
	{
		System.out.println("Calculation task Started");
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Calculating.........");
		}
	   System.out.println("Calculation completed....");
	}
}
public class MultiThreading05 {

	public static void main(String[] args) {
		
		Alpha a1=new Alpha();
		Alpha a2=new Alpha();
		Alpha a3=new Alpha();
		
		a1.setName("BANK");
		a2.setName("PRINT");
		a3.setName("CALC");
		
		a1.start();
		a2.start();
		a3.start();
	}

}
