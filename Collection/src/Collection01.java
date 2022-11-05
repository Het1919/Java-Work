import java.util.*; //ArrayList
public class Collection01 {

	public static void main(String[] args) {
		
		ArrayList al1=new ArrayList();
		
		al1.add("Ineuron");
		al1.add("B");
		al1.add(4);
		al1.add(25.5);
		
	
		System.out.println(al1);  //[Ineuron,B,4,25.5]
		
		ArrayList al2=new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		
		System.out.println(al2); //[10,20,30]
        
		al2.addAll(al1);
		System.out.println(al2); //[10,20,30,Ineuron,B,4,25.5]
		
		System.out.println(al2.contains(20)); //true
        System.out.println(al2.get(3)); //Ineuron (0 based indexing)
        
        boolean a=al2.isEmpty();
        System.out.println(a); //false
        
        int b=al2.size();
        System.out.println(b); //7 (no. of elements) 
        
        System.out.println(al2.getClass()); //class java.util.ArrayList
        
        ArrayList al3=new ArrayList();
     
        al3.add("Bengaluru");
        al3.add("India");
        al3.add(15);
        al3.add(20.5);
        
        System.out.println(al3); // [Bengaluru,India,15,20.5]
        
        al3.clear(); 
        System.out.println(al3); // []
        System.out.println(al3.isEmpty()); // true
        
        al3.ensureCapacity(5);
        al3.add("Bengaluru");
        al3.add("India");
        al3.add(15);
        al3.add(20.5);
        al3.add(1,"Het");
        System.out.println(al3.size()); // 5
        al3.trimToSize();
        System.out.println(al3); // [Bengaluru,Het,India,15,20.5]
        
        
        ArrayList al4=new ArrayList();
        al4.add(100);
        al4.add(200);
        System.out.println(al4); //[100,200]
        al4.addAll(1,al3);
        System.out.println(al4); // [100,Bengaluru,Het,India,15,20.5,200]
        
	}
}
