package DeviceFactory;

public class Laptop extends Device{
	private String batteryLife;

	public Laptop(String batteryLife) {
		super();
		this.batteryLife = batteryLife;
	}
	
	public Laptop() {
		super();
	}

	@Override
	public String toString() {
		String result = super.toString();
		result += "\nThis is laptop with battery life " + getBatteryLife();
		return result;
	}



	public String getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(String batteryLife) {
		this.batteryLife = batteryLife;
	}
	
	

}
