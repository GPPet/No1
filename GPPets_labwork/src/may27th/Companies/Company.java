package may27th.Companies;

public class Company {
	
	protected String name;
	protected int numberEmployees;
	
	public Company(){
		
	}
	
	public Company(String name, int numberEmployees){
		setName(name);
		setNumberEmployees(numberEmployees);
	}
	
	public int getNumberEmployees(){
		return numberEmployees;
	}
	public void setNumberEmployees(int numberEmployees){
		this.numberEmployees = numberEmployees;
	}

	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
