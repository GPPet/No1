package may13th.Person;

public class People {
	public static void main (String[] arg){
		Person peterPanov = new Person("Peter Panov", 23, "peter.panov@abv.bg");
		peterPanov.printInfo();
		peterPanov.age = 90;
		peterPanov.printInfo();
		
		Person dianaPetrova = new Person("Diana Petrova", 45, "diana.petrova@gmail.net");
		dianaPetrova.printInfo();
		
		Person stasStassov = new Person("Stas Stassov", 87, "-");
		stasStassov.printInfo();
		
		
	}
	
	

}
