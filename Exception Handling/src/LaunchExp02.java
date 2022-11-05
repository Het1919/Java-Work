//finally VS return
class Demo
{
	int disp()
	{
		try {
			System.out.println("Disp");
			return 10;//finally dominates over return.
		}
		finally {
		    System.out.println("Disp last line");
		}
	}
}
public class LaunchExp02 {

	public static void main(String[] args) {
		
		Demo d=new Demo();
		System.out.println(d.disp());

	}

}
