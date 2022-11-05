import java.util.*; // Iterator,ListIterator.

public class Collection07 {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l); //[10,20,30,40,50]
		
		//using regular for loop
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println("********************");
		
		//enhanced for loop - for each
		for(Object o:l)
		{
			System.out.println(o);
		}
        
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add("Het");
		ll.add("Hyderabad");
		
		System.out.println("********************");
		
		//Iterator -> Traverse only in forward direction.
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("********************");
		
		LinkedList ll2=new LinkedList();
		ll2.add(100);
		ll2.add(200);
		ll2.add("Het");
		ll2.add("Hyderabad");
		
		//ListIterator -> Traverse in Both the direction forward as well as backward.
		ListIterator lit=ll2.listIterator(ll2.size());
		
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
		System.out.println("********************"); 
		
		LinkedList ll3=new LinkedList();
		ll3.add(100);
		ll3.add(200);
		ll3.add("Het");
		ll3.add("Hyderaabad");
		
		Iterator ditr=ll3.descendingIterator();
		
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
	  
	}

}
