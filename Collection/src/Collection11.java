//Map-2
import java.util.*;
public class Collection11 {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put(null,0); //null->0
		hm.put(null, null); // null->null
		hm.put(null,"ABC"); //null->ABC
		System.out.println(hm);
	}

}
