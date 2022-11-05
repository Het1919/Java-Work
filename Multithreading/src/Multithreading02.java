
public class Multithreading02 {

	public static void main(String[] args) {
        
		System.out.println("Hello focus here");
		
        Thread t=Thread.currentThread();//gives you name,priority,which method
        System.out.println(t);
        
        String name=Thread.currentThread().getName();
        System.out.println(name);
        
        t.setName("Het Shah");//change main thread name
        t.setPriority(4);
        System.out.println(t);
	}

}
