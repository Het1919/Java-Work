package in.ineuron.entities;

//Dependant Class
public class Employee {

	private Integer eid;
	private String ename;
	
	//Constructor Injection
	public Employee(Integer eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
    
	//getters to get values.
	public Integer getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}
}
