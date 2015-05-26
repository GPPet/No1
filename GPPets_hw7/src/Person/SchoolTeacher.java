package Person;

public class SchoolTeacher extends Teacher{
	private String[] classes = new String[5];
	
	public SchoolTeacher(){
		super();
		//setClasses(String[]);
	}
	
	public SchoolTeacher(String firstName, String familyName, int yearsOfService, String subject, String[] classes){
		super(firstName, familyName, yearsOfService, subject);
		//setClasses(classes[5]);
	}
	
	public String[] getClasses(){
		return classes;
	}
	public void setClasses(String classes[]){
		this.classes = classes;
	}
	
	public void checkHomework(){
		super.checkHomework();
	}
	
	public void printClasses(){
		String list = "";
		for (int i = 0; i < 5; i++){
			list = list + classes[i] + " ";
		} 
		System.out.println("Mr/Mrs " + familyName + "\'s Classes" + list);
	}
	
	public void entertainChildren(){
		System.out.println("Mr/Mrs " + familyName + " organizes games for the children in his/her classes.");
	}
	

}
