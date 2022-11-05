/*Reverse a String*/

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		System.out.println("Enter String");
		Scanner input=new Scanner(System.in);
		String s1=input.next();
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		s1=s2;
		System.out.println("reverse string is =>"+s1);
	}

}
