//Map-4
import java.util.*;
public class Collection13 {

	public static void main(String[] args) {
		
		IdentityHashMap ihm=new IdentityHashMap();
		//If it is IdentityHashMap JVM calls double equal to operator to identify whether the keys are duplicated or not. 
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10); //(i1==i2) false. -->Checking hashcode.
		
		ihm.put(i1,"Sachin");
		ihm.put(i2,"Messi");
		
		System.out.println(ihm);

	}

}
