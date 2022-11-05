//Map-6
import java.util.*;
public class Collection15 {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap hm=new HashMap();
		Temp t=new Temp();
		hm.put(t,"shri");
		System.out.println(hm);
		
		t=null; //making eligible for garbage Collection.
		System.gc();//Triggering garbage collector thread to clean 't'.
		//But Garbage collector won't clean temp object bcz HashMap would always dominate over GarbageCollector.
		//If i want to clean then use WeakHashMap.
		
		Thread.sleep(5000);
		
		System.out.println(hm);

	}

}

class Temp
{
	@Override
	public String toString() {
		return "temp";
	}
	
	@Override
	public void finalize() {
		System.out.println("Cleaning");
	}
}
