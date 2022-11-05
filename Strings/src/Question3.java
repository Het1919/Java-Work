/*Anagram Strings*/

import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		
		System.out.println("Enter 1st String");
		Scanner input=new Scanner(System.in);
		String s1=input.next();
		System.out.println("Enter 2nd String");
		String s2=input.next();
		
		int x=0;
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					x++;
				}
			}
		}
		if(x==s1.length() && x==s2.length())
		{
			System.out.println("String is Anagram");
			System.exit(0);
		}
		else
		{
			System.out.println("String is Not Anagram");
		}
	}

}
