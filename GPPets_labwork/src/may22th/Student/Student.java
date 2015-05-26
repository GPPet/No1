package may22th.Student;

public class Student {
	protected String firstName;
	protected String familyName;
	protected int facNumber;
	protected int group;
	
	public Student(){
		setFirstName("");
		setFamilyName("");
		setFacNumber(0);
		setGroup(0);
	}
	
	public Student(String firstName, String familyName, int facNumber, int group){
		setFirstName(firstName);
		setFamilyName(familyName);
		setFacNumber(facNumber);
		setGroup(group);
	}

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
	
	public int getFacNumber(){
		return facNumber;
	}
	public void setFacNumber(int facNumber){
		this.facNumber = facNumber;
	}
	
	public int getGroup(){
		return group;
	}
	public void setGroup(int group){
		this.group = group;
	}
	
	@Override
	public String toString() {
		return "Name:\t" + this.firstName + " " + this.familyName + "\nFacNo:\t" + this.facNumber + "\nGroup:\t" + this.group;
	}
	

}
