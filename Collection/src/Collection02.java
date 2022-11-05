import java.util.*; //LinkedList
public class Collection02 {

	public static void main(String[] args) {
		
		LinkedList ll1=new LinkedList();
		ll1.add(19);
		ll1.add("Het");
		ll1.add('M');
		ll1.add("Vadodara");
		
		System.out.println(ll1); // [19,Het,M,Vadodara]
		
		ll1.add(3,1500000); 
		System.out.println(ll1); // [19,Het,M,1500000,Vadodara]
		
		ll1.addFirst("Google");
		ll1.addLast("Software Developer");
		
		System.out.println(ll1); // [Google,19,Het,M,1500000,Vadodara,Software Developer]
		
//		System.out.println(ll1.pop());
		
		LinkedList ll2=new LinkedList();
		ll2.add("NY");
		ll2.offer("USA");
		
		System.out.println(ll2); // [NY,USA]
        
		ll1.addAll(ll2);
		System.out.println(ll1); // [Google,19,Het,M,1500000,Vadodara,Software Developer,NY,USA]
	}

}
