package Person;

public abstract class Person {
	protected String firstName;
	protected String familyName;
	protected int yearsOfService;
	
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFamilyName(){
		return familyName;
	}
	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}
	
	public int getYearsOfService(){
		return yearsOfService;
	}
	public void setYearsOfService(int yearsOfService){
		this.yearsOfService = yearsOfService;
	}
	
	public abstract void checkHomework();
	
}
