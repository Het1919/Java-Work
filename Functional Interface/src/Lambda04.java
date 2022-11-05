interface Hey
{
	int add(int num1,int num2);
}
public class Lambda04 {

	public static void main(String[] args) {
		
		Hey hy = (n1,n2) ->{
			int result=n1+n2;
			return result;
		};
		System.out.println(hy.add(3, 4));

	}

}

