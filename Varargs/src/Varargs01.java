//variable length arguments

class calc 
{
	public int add(int ... num)
	{
		int sum=0;
		for(int i:num)
		{
			sum+=i;
		}
		return sum;
	}
}
public class Varargs01 {

	public static void main(String[] args) {
		
		calc c=new calc();
		int result=c.add(3,4,5,6,7,8);
		System.out.println(result);

	}

}
