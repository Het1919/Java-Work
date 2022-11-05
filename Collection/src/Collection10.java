//Map-1
import java.util.*;
public class Collection10 {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put(10,"Sachin");
		hm.put(7,"Dhoni");
		hm.put(18,"Virat");
		hm.put(45,"Rohit");
		
		System.out.println(hm); //hm.toString() will be called.
		
		Set s=hm.keySet(); //method gets executed and the object is created at the runtime.To get the Keys from the Map.
		System.out.println(s);
		System.out.println(s.getClass().getName());
		
		Collection c=hm.values(); //to get the values from the Map.
		System.out.println(c);
		System.out.println(c.getClass().getName());
		
		Set s1=hm.entrySet(); // to get the key,value pair from the Map.
		System.out.println(s1);
		System.out.println(s1.getClass().getName());
		
		System.out.println();
		
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry data=(Map.Entry) itr.next();
			System.out.println(data.getKey() +":"+ data.getValue());
			if(data.getKey().equals(10))
			{
				data.setValue("Het");
			}
		}
		System.out.println(hm);
	}

}

//If you are using LinkedHashmap instead of HashMap, order of insertion should be preserved.That's the only difference.

