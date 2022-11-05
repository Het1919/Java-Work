import java.io.*;

public class File02 {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		int l=0,w=0,c=0;
		
		BufferedReader br=new BufferedReader(new FileReader("sample.txt"));
        
		String currLine=br.readLine();
		
		while(currLine!=null)
		{
			l++;
			
			String words[]=currLine.split(" ");
			w=w+words.length;
			
			for(String word:words)
			{
				c=c+word.length();
			}
			c=c+(words.length-1);
			
			currLine=br.readLine();
			
		}
		System.out.println("No. of Lines      :"+l);
		System.out.println("No. of words       :"+w);
		System.out.println("No. of characters :"+c);
		
	}

}
