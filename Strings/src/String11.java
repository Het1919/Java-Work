
public class String11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());//default capacity is 16.
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());
		sb.append("Q");
		System.out.println(sb.capacity());
		
		StringBuilder sb1=new StringBuilder(19);
		System.out.println(sb1.capacity());

	}

}
