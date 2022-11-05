//finally VS system.exit(0)

class Beta
{
	 void disp()
	 {
		 try {
			 System.out.println("Disp Method");
			 System.exit(0);//dominates over finally.
		 }
		 finally {
			 System.out.println("Finally");
		 }
	 }
}
public class LaunchExp03 {

	public static void main(String[] args) {
		
		Beta b=new Beta();
		b.disp();

	}
}
