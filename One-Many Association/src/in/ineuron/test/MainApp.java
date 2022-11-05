package in.ineuron.test;

import in.ineuron.entities.Department;
import in.ineuron.entities.Employee;

public class MainApp {

	public static void main(String[] args) {
		
		//Creating Dependant Object using constructor injection
		Employee emp1=new Employee(7,"Dhoni");
		Employee emp2=new Employee(18,"Virat");
		Employee emp3=new Employee(10,"Sachin");
		
		//creating an array to perform one-many association
		Employee[] employees=new Employee[3];
		employees[0]=emp1;
		employees[1]=emp2;
		employees[2]=emp3;
		
		//creating a Target object using constructor Injection
		Department department = new Department(19,"BCCI","India",employees);
		department.display();

	}

}
