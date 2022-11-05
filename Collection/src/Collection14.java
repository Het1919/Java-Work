//Map-5
import java.util.*;
public class Collection14 {

	public static void main(String[] args) throws InterruptedException {
		
		Employee e=new Employee();
		
		;;;;;;;;;;
		;;;;;;;;;;
		;;;;;;;;;;
		
		e=null; //Garbage Object.
		
		System.gc(); //Infroming JVM to active GC thread to clean the garbage object.
		Thread.sleep(5000);

	}

}

class Employee
{
	@Override
	public void finalize()
	{
		System.out.println("Cleaning the Object");
	}
}
