package stock;

public class SuperMarket {
	protected String name;
	protected String address;
	
	public SuperMarket(){
		setName("");
		setAddress("");
		
	}
	
	public SuperMarket(String name, String address, int[] alcohol){
		setName(name);
		setAddress(address);
		
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
}
