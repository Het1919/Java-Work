@FunctionalInterface
interface CLS
{
	int getLength(String s);
}

public class Anonymous02 {
     public static void main(String[] args)
     {
    	 CLS c=new CLS() {
    		 public int getLength(String s)
    		 {
    			 int res=s.length();
    			 return res;
    	     }
    	 };
    	 System.out.println(c.getLength("ALien"));
     }
}
