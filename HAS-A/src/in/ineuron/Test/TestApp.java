package in.ineuron.Test;

import in.ineuron.entities.Account;
import in.ineuron.entities.Employee;
public class TestApp {

	public static void main(String[] args) {
		
		Account account=new Account("ISB-1111","savings","sachin");
		
		//Create a target object and inject the dependant object in the constructor
		Employee employee=new Employee(10,"sachin","MI",account);
		
		employee.display();

	}

}
