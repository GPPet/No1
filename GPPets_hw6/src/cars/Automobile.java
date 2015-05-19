package cars;

public class Automobile extends Car {
	protected float fuelConsump;
	
	public Automobile(){
		super();
		this.fuelConsump = 0;
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
