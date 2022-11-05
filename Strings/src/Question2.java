/*reversing sentence*/

public class Question2 {

	public static void main(String[] args) {
		
		String s1="Think Twice";
		String[] a=s1.split(" ");
		
		String s2=a[0];
		String s3=a[1];
		String s4="";
		String s5="";
		
		for(int i=s2.length()-1;i>=0;i--)
		{
			s4=s4+s2.charAt(i);
		}
		
		for(int i=s3.length()-1;i>=0;i--)
		{
			s5=s5+s3.charAt(i);
		}		
		System.out.println(s4+" "+s5);
		
	}

}
