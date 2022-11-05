/* Cnt no. of vowels and consonants in a string */
public class Question7 {

	public static void main(String[] args) {
		
		int Vcnt=0;
		int Ccnt=0;
		
		String s1="umbrella";
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
			{
				Vcnt++;
			}
			else
			{
				Ccnt++;
			}
		}
		System.out.println("No. of vowels are "+Vcnt+" and no. of consonants are "+Ccnt);

	}

}
