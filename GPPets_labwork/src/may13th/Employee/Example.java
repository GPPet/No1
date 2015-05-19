package may13th.Employee;

public class Example {
	public static void main(String[] args){
		Doctor peterPetrov = new Doctor("Peter Petrov", 56, 640, 10, 5);
		peterPetrov.basicInfo();
		peterPetrov.addInfo();
		
		Policeman draganStefanov = new Policeman("Dragan Stefanov", 40, 450, "sergeant");
		draganStefanov.basicInfo();
		draganStefanov.addRank();
		
		
		
	}
}
