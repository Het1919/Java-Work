
public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String s1="Alien";
		String s2="alien";
		String s3=new String("Alien");
		
		System.out.println(s1==s2);//(==) compares references.
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));//(equals) compare values.
		System.out.println(s1.equalsIgnoreCase(s2));// case insensitive compare values.
	}

}
