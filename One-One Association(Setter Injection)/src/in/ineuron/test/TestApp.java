package in.ineuron.test;

import in.ineuron.entities.Account;
import in.ineuron.entities.Employee;

public class TestApp {

	public static void main(String[] args) {
		
		Account account=new Account();
		account.setAccName("SBI");
		account.setAccNo("HS-19");
		account.setAccType("Saving");
		
		//Create a target object and inject the dependant object in the constructor
		Employee employee=new Employee();
		employee.setAccount(account);
		employee.setEaddress("Vadodara");
		employee.setEid(19);
		employee.setEname("Het Shah");
		
		employee.display();

	}
}

