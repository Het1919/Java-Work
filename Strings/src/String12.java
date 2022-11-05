
public class String12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("abcdef");
		sb.insert(2,"xyz");
		System.out.println(sb);
		sb.insert(9,"het");
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("HetJayeshkumarShah");
		sb1.delete(3,14);
		System.out.println(sb1);
		
		sb1.deleteCharAt(4);
		System.out.println(sb1);
		
		sb1.insert(4,"h");
		System.out.println(sb1);
		
		sb1.reverse()
;
		System.out.println(sb1);
		
		
	}

}
