package cars;

public class Automobile extends Car {
	protected float fuelConsump; //! should be private because we are not
	// going to use it further!!! protected is also OK especially if the class is going to have other children;
	
	public Automobile(){
		//super();
		//this.fuelConsump = 0;
	}
	
	public Automobile(int price, float fuelConsump){
		super(price);
		
		setFuelConsump(fuelConsump);
	}
	
	public float getFuelConsump(){
		return fuelConsump;
	}
	
	public void setFuelConsump(float fuelConsump){
		this.fuelConsump = fuelConsump;
	}
	
}
