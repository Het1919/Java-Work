interface Hey
{
	int add(int num1,int num2);
}
public class Lambda03 {

	public static void main(String[] args) {
		
		Hey hy = (n1,n2) -> n1+n2;
		System.out.println(hy.add(3, 4));

	}

}
