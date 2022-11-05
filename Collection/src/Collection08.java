import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Collection08 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//			al.add(60); // Lead into Infinite Loop
//		}
		
//		Iterator it=al.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//			al.add(60); // raised exception as ConcurrentModificationException
//		}
	
		//Iterator of CopyOnArrayList never throws an ConcurrentModificationException.
		CopyOnWriteArrayList cal=new CopyOnWriteArrayList();
		cal.add(100);
		cal.add(200);
		cal.add(300);
		cal.add(400);
		
		Iterator it1=cal.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
			cal.add(500);
		}
		
	}

}
