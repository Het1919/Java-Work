class Demo4 implements Runnable //Inbuilt Class
{
	public void run()// Definition of thread
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
}

class Demo5 implements Runnable
{
	public void run()
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
}

class Demo6 implements Runnable
{
	public void run()
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

public class MultiThreading04 {

	public static void main(String[] args) {
		
		Demo4 d4=new Demo4();
		Demo5 d5=new Demo5();
		Demo6 d6=new Demo6();
		
		Thread t1=new Thread(d4);
		Thread t2=new Thread(d5);
		Thread t3=new Thread(d6);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
