package may13th.Employee;

public class Employee {
	protected String name;
	protected int hPerWeek;
	protected int weekSalary;
	
	public Employee(){
		this.name = "";
		this.hPerWeek = 0;
		this.weekSalary = 0;
	}
	
	public Employee(String name, int hPerWeek, int weekSalary){
		this();
		setName(name);
		setHPerWeek(hPerWeek);
		setWeekSalary(weekSalary);
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getHPerWeek(){
		return hPerWeek;
	}
	
	public void setHPerWeek(int hPerWeek){
		this.hPerWeek = hPerWeek;
	}
	
	public int getWeekSalary(){
		return weekSalary;
	}
	
	public void setWeekSalary(int weekSalary){
		this.weekSalary = weekSalary;
	}
	
	public void basicInfo(){
		System.out.println("Name:\t" + name + "\nHours per week:\t" + hPerWeek + "\nWeek salary:\t" + weekSalary);
	}
	

}

