import java.io.*;

public class File01 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f=new FileInputStream("E:/het.txt");
		FileOutputStream w=new FileOutputStream("E:/het2.txt");
		
		int i;
		while((i=f.read())!=-1)
		{
			w.write((char)i);
		}
		
		System.out.println("Data copied successfully!!...");

	}

}
