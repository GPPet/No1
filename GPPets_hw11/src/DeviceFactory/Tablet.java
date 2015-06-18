package DeviceFactory;

public class Tablet extends Device{
	private String os;

	public Tablet(){
		super();
	}
	
	public Tablet(String os) {
		super();
		this.os = os;
	}



	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		String result = super.toString();
		result += "\nTablet with OS " + getOs();
		return result;
	}
	
	
	

}
