package cats;

public class Cat {
	protected String catName;
	protected int catAge;
	
	public Cat(){
		this.catName = "";
		this.catAge = 0;
	}
	
	public Cat(String catName, int catAge){
		this();
		
		setCatName(catName);
		setCatAge(catAge);
	}
	
	public String getCatName(){
		return catName;
	}
	
	public void setCatName(String catName){
		this.catName = catName;
	}
	
	public int getCatAge(){
		return catAge;
	}
	
	public void setCatAge(int catAge){
		this.catAge = catAge;
	}
	
	public void Say(){
		System.out.println("Cat name:\t" + catName + "\nCat age:\t" + catAge);
		System.out.println();
	}
}
