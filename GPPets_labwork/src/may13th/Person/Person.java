package may13th.Person;

public class Person {
	String name;
	private String eMail;
	int age;
	
	public Person(String name, int age, String eMail){
		this.name = name;
		this.age = age;
		this.eMail = eMail;
	}
	
	public void printInfo(){
		System.out.println("Name:\t" + name + "\nAge:\t" + age + "\nE-mail:\t" + eMail);
		System.out.println();
	}

}
