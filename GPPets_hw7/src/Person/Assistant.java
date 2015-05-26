package Person;

public class Assistant extends Lecturer{
	private boolean chief; //better name isChief
	
	public Assistant(){
		super();
		setChief(false);
	}
	
	public Assistant(String firstName, String familyName, String uniName, int yearsOfService, boolean chief){
		super(firstName, familyName, uniName, yearsOfService);
		setChief(chief);
	}
	
	public boolean getChief(){
		return chief;
	}
	public void setChief(boolean chief){
		this.chief = chief;
	}

	public void printAssistInfo(){
		if (chief == true){
			System.out.println("Chief Assistant " + familyName);
		} else {
			System.out.println("Assistant " + familyName);
		}
	}
	
	public void checkExams(){
		System.out.println("Dr. " + familyName + " is checking the final exam tests on Organic chemistry.");
	}
	
	public void writePapers(){
		System.out.println("Dr. " + familyName + " publishes research results in high level international journals.");
	}
	
	@Override
	public void checkHomework(){
		System.out.println("Dr. " + familyName + " checks also the homeworks given by Prof. Mitronov at the lectures.");
	}
}
