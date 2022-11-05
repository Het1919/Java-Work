@FunctionalInterface
interface Alphax
{
	void beta();
}


public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		//anonymous inner class
		Alphax a=new Alphax() {
			public void beta()
			{
				System.out.println("Beta Implementation");
			}
		};
        a.beta();
	}

}
