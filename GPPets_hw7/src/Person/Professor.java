package Person;

public class Professor extends Lecturer{
	private String title;
	
	public Professor(){
		super();
		setTitle("");
	}
	
	public Professor(String firstName, String familyName, String uniName, int yearsOfService, String title){
		super(firstName, familyName, uniName, yearsOfService);
		setTitle(title);
	}
	
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}

	public void printProfInfo(){
			System.out.println(familyName + "\nTitle:\t" + title + "\nYears of service:\t" + yearsOfService);
	}
	
	public void orgExams(){
		System.out.println(title + " " + familyName + " examines the students at the end of the term with test.");
	}
	
	@Override
	public void checkHomework(){
		System.out.println(title + " " + familyName + " gives homeworks at every lecture and checks them before the next one.");
	}
}
