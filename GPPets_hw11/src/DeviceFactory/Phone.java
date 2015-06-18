package DeviceFactory;

public class Phone extends Device{
	private float weight;

	public Phone() {
		super();
	}

	@Override
	public String toString() {
		String result = super.toString();
		result += "\nPhone with weight " + getWeight();
		return result;
	}



	public float getWeight() {
		return weight;
	}



	public void setWeight(float weight) {
		this.weight = weight;
	}

	
	
	

}
