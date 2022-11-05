//Map-7
import java.util.*;
public class Collection16 {

	public static void main(String[] args) throws InterruptedException {
		
		WeakHashMap hm=new WeakHashMap();
		Temp1 t=new Temp1();
		hm.put(t,"shri");
		System.out.println(hm);
		
		t=null; //making eligible for garbage Collection.
		System.gc();//Triggering garbage collector thread to clean 't'.
		//Garbage Collector will clean the object as the data is present in WeakHashMap. so we say GC dominates WeakHashMap.
		
		Thread.sleep(5000);
		
		System.out.println(hm);

	}

}

class Temp1
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

