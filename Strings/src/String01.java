
public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Alien";//Inside Heap String Constant pool.
		String s2="Alien";//reference to s1 inside Heap SCP.
		String s3=new String("Alien");//Inside Actual HeapArea.
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);

	}

}
