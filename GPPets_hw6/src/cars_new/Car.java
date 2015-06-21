package cars_new;

public class Car {
	protected double price;
	
	public Car(){
	}

	public Car(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0 ) this.price = 0;
		else this.price = price;
	}
	
	

}
