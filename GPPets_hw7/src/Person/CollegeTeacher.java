package Person;

public class CollegeTeacher extends Teacher{
	private String collName;
	
	public CollegeTeacher(){
		super();
		setCollName("");
	}
	
	public CollegeTeacher(String firstName, String familyName, int yearsOfService, String subject, String collName){
		super(firstName, familyName, yearsOfService, subject);
		setCollName(collName);
	}
	
	public String getCollName(){
		return collName;
	}
	public void setCollName(String collName){
		this.collName = collName;
	}
	
	public void checkHomework(){
		super.checkHomework();
	}
	

}
