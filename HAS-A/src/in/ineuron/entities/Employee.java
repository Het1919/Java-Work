package in.ineuron.entities;

//Target Class
public class Employee {
  
	private Integer eid;
	private String ename;
	private String eaddress;
	
	//HAS-A variable Injection
	private Account account;

	//Constructor Injection(alt+shift+s,o)
	public Employee(Integer eid, String ename, String eaddress, Account account){
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
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
