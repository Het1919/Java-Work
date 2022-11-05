package in.ineuron.entities;

//Dependant Class
public class Account {
	
	//instance variable
	private String accNo;
	private String accType;
	private String accName;
	
	//Performing Constructor
	public Account(String accNo,String accType,String accName)
	{
		this.accNo=accNo;
		this.accType=accType;
		this.accName=accName;
	}

	//sending the data to the user
	public String getAccNo() {
		return accNo;
	}

	public String getAccType() {
		return accType;
	}

	public String getAccName() {
		return accName;
	}
	
}
