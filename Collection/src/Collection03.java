import java.util.*; //ArrayDeque
public class Collection03 {

	public static void main(String[] args) {
		
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add("Het");
		ad.add("India");
		
		System.out.println(ad); // [10,20,Het,India]
		ad.addFirst(100);
		ad.addLast(200);
		System.out.println(ad); //[100,10,20,Het,India,200]

	}

}
