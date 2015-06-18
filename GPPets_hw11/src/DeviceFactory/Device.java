package DeviceFactory;

public abstract class Device {
	private String model;
	private String brand;
	
	public Device(){
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "Device model:\t" + getModel();
		result += "\nBrand:\t" + getBrand();
		return result;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
}
