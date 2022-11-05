package in.ineuron.entities;

//Target Class
public class Department {
	
	//instance variable
	private Integer deptno;
	private String dname;
	private String dloc;
    
	//Has-A variable
	private Employee[] employees;
	
	//Constructor Injection
	public Department(Integer deptno, String dname, String dloc, Employee[] employees) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.dloc = dloc;
		this.employees = employees;
	}
	
	public void display()
	{
		System.out.println("*****Department Details are Here*****");
		System.out.println("DeptNo   is   ::"+deptno);
		System.out.println("DeptName is   ::"+dname);
		System.out.println("DeptLoc  is   ::"+dloc);
		
		System.out.println("*****Employees Deatils are Here*****");
		
		for(Employee emp:employees)
		{
			System.out.println("EmpId      is ::"+emp.getEid());
			System.out.println("EmpName    is ::"+emp.getEname());
			System.out.println();
		}
	}
	
	
}
