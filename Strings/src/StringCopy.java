
public class StringCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Alien";
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i);
		}
        
		System.out.println(s2);
		
	}

}
