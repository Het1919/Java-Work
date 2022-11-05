class Books
{
	private int pgNo;
	
	public void setPgNo(int x)
	{
		if(x>0) {
		   pgNo=x;
		}
		else
		{
			System.out.println("Invalid Input!");
		}
	}
	public int getPgNo()
	{
		return pgNo;
	}
}

public class Encap01 {

	public static void main(String[] args) {
		
        Books b=new Books();
        b.setPgNo(100);
        System.out.println(b.getPgNo());
	}

}
