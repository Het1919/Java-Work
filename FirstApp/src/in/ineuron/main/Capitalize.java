package in.ineuron.main;
import java.util.Scanner;

public class Capitalize {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		Scanner input=new Scanner(System.in);
		
		String s1;
		System.out.println("Enter String: ");
		s1=input.nextLine();
		char ch;
		
		sb.append(s1);
		
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)>='a' && sb.charAt(i)<='z')
			{
				ch= (char)(sb.charAt(i)-32);
				sb.setCharAt(i,ch);
			}
		}
		
		System.out.println(sb);

	}

}
