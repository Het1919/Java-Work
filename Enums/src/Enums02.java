enum Results
{
	PASS,FAIL,NR; // predefined constant (static and final)
	int marks; //normal fields (instance variable)
	
	Results()
	{
		System.out.println("Constructor is getting called");
	}
	void setMarks(int marks)
	{
		this.marks=marks;
	}
	int getMarks()
	{
		return marks;
	}
}
public class Enums02 {

	public static void main(String[] args) {
		
		 Results.PASS.setMarks(45);
	     int marks = Results.PASS.getMarks();
	     System.out.println(marks);

	}

}
