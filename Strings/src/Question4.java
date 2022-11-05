/*pangram string*/

public class Question4 {
	
	public static void allletter(String str)
	{
		str=str.toLowerCase();
		
		boolean allletterpresent=true;
		
		for(char ch='a';ch<='z';ch++)
		{
			if(!str.contains(String.valueOf(ch)))
			{
				allletterpresent=false;
				break;
			}
		}
		
		if(allletterpresent)
		{
			System.out.println("String is Panagram");
		}
		else
		{
			System.out.println("Strings are not Panagram");
		}
	}

	public static void main(String[] args) {
		
		String s1="AbcdefghijklmnopqrstuVwxyz123";
		
		allletter(s1);
		

	}

}
