import java.util.*; // Enumeration

public class Collection09 {

	public static void main(String[] args) {
		
		// Vector -> Legacy class.
		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		
		//To access legacy classes which are vector,stack,dictionary we have to use Enumeration.
		//It's just like an iterator.
		Enumeration e=v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	
	}

}
