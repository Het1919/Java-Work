//Map-9
import java.util.*;
import java.io.*;

public class Collection18 {

	public static void main(String[] args) throws Exception {
		
		Properties p=new Properties();
		//Key(String)=Value(String)
		
		FileInputStream fs=new FileInputStream("D:\\JavaApplication\\database.properties");
		
		p.load(fs);
		
		System.out.println(p);
		
		
		p.setProperty("Company","Google");
		FileOutputStream fos=new FileOutputStream("D:\\JavaApplication\\database.properties");
		p.store(fos,"Map Operation got Concluded");
		

	}

}
