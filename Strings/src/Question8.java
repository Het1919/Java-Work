/*Cnt no.of special characters*/

public class Question8 {

	public static void main(String[] args) {
		
		String s="#James@Bond$786*";
		int cnt=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='@' || s.charAt(i)=='#' || s.charAt(i)=='$' || s.charAt(i)=='*')
			{
				cnt++;
			}
		}
        
		System.out.println("No.of speacial characters are "+ cnt);
	}

}
