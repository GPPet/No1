package lw10_Town;

public class Town {
	// Направете клас Town с полета име, държава и население. Направете HashSet  с Тоwn и добавете 5 града. 
	// Нека един от градовете да е със следните стойности: Варна, България, 330000. 
	// Проверете дали сетът съдържа Варна. Премахнете Варна от сета.

	private String townName;
	private String country;
	private long population;
	
	public Town(){
		this.townName = "";
		this.country = "";
		this.population = 0l;		
	}
	 public Town(String townName, String country, long population){
		 setTownName(townName);
		 setCountry(country);
		 setPopulation(population);
	 }
	
	
	public String getTownName() {
		return townName;
	}
	public void setTownName(String townName) {
		this.townName = townName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		if (population > 0) this.population = population;
		else this.population = 0l;
	}
	
	
	@Override
	public String toString() {
		String result = "";
		result += "Town:\t" + getTownName();
		result += "\nCountry:\t" + getCountry();
		result += "\nPopulation:\t" + getPopulation();
		return result;
	}
	
	
	
}
