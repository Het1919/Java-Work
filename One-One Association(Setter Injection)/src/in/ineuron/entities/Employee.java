package in.ineuron.entities;

//Target Class
public class Employee {

	private Integer eid;
	private String ename;
	private String eaddress;
	
	//HAS-A variable Injection
    private Account account;
	
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
    public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	//code for displaying the data of employee
	public void display()
	{
		System.out.println("*****Employee Details are****");
		System.out.println("EID    is :: "+eid);
		System.out.println("ENAME  is :: "+ename);
		System.out.println("EADDR  is :: "+eaddress);
		
		System.out.println("****ACCOUNT Details are****");
		System.out.println("ACCNO   is   ::"+account.getAccNo());
		System.out.println("ACCTYPE is   ::"+account.getAccType());
		System.out.println("ACCNAME is   ::"+account.getAccName());
		
	}
}
