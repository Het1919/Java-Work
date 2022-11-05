@FunctionalInterface
interface Computer
{
	void show();
}
public class LambdaExpression01 {

	public static void main(String[] args) {
		//lambda expression is just like arrow function in JavaScript.
		
		//Anonymous inner class.
//		Computer comp=new Computer() {
//			public void show()
//			{
//				System.out.println("In show");
//			}
//		};
		
		//Lambda Exp.
		Computer comp=() -> System.out.println("In show");
	
        
		comp.show();
	}

}
