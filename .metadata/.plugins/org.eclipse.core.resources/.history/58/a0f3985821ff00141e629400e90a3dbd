package Person;

public class Lecturer extends Person implements Exercise {
	protected String uniName;
	private static final int MAX_LECTURES = 10;
	
	public Lecturer(){
		setFirstName("");
		setFamilyName("");
		setUniName("");
		setYearsOfService(0);
	}
	
	public Lecturer(String firstName, String familyName, String uniName, int yearsOfService){
		setFirstName(firstName);
		setFamilyName(familyName);
		setUniName(uniName);
		setYearsOfService(yearsOfService);
	}
	
	public String getUniName(){
		return uniName;
	}
	public void setUniName(String uniName){
		this.uniName = uniName;
	}
	
	public void checkHomework() {
		System.out.println("Dr. " + familyName + "requires the homeworks to be submitted before next lecture and checks them on time.");
	}
	
	public void sayGoodMorning(){
		System.out.println("Dr. " + familyName + ": Good morning!");
	}


	@Override
	public void exercise() {
		System.out.println("Dr. " + familyName + "has exersizes.");
		
	}

	@Override
	public void exercise(String subjectExer, int hours) {
		System.out.println("Dr. " + familyName + "has " + hours + "h exersizes on " + subjectExer + ".");
		
	}

	@Override
	public void exercise(int numberStudents, int roomNo) {
		System.out.println("Dr. " + familyName + "has exersizes with " + numberStudents + " students in room " + roomNo);
		
	}	
	
} 
