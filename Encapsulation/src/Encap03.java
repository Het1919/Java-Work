class Alien
{
	private int age;
	private String name;
	
    public Alien(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}


public class Encap03 {

	public static void main(String[] args) {
		
//        Alien a=new Alien();
//        a.setAge(19);
//        a.setName("Het");
//        System.out.println(a.getAge());
//        System.out.println(a.getName());
		
		Alien a=new Alien(19,"Het");
		System.out.println(a.getAge());
		System.out.println(a.getName());
	}

}
