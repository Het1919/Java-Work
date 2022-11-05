class Google implements Runnable
{
	public void run() {
		try
		{
			for(int i=0;i<4;i++)
			{
				System.out.println("Java is best to understand for coding");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class MultiThreading11 {

	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		System.out.println(t.isDaemon());
		
		Thread t1=new Thread();
		System.out.println(t1.isDaemon());
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		
		Google g=new Google();
		Thread t2=new Thread(g);
		System.out.println(t2.isDaemon());
		t2.start();
		t2.setDaemon(true);
	}

}
