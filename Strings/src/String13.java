
public class String13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder("HetJayeshkumarShah");
		System.out.println(sb.length());
		
		sb.setLength(3);
		System.out.println(sb);
		System.out.println(sb.length());
		
		
		
		StringBuilder sb1=new StringBuilder(1000);
		System.out.println(sb1.capacity());
		sb1.append("iNeuron");
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		
		
		
		
		
	}

}
