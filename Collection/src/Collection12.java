 //Map-3
import java.util.*;
public class Collection12 {

	public static void main(String[] args) {
		
		HashMap h=new HashMap();
		//If it is HashMap JVM calls equals Method to identify whether the keys are duplicated or not.
		
		//Creating a Key
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);  //i1.equals(i2)==true. -->Checking Values.
		
		//Adding the data to HashMap
		h.put(i1,"Sachin");
		h.put(i2,"Messi"); //value overridden.
		
		System.out.println(h);

	}

}
