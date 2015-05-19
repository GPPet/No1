package stock;

public class Veggies extends Stock {
	private String veggiesType; // tomatoes, etc.  
	protected boolean imported;
	
	public Veggies(){
		setPrice(0f);
		setAvailable(false);
		setBestBeforeDays(0);
		setVeggiesType("");
		setImported(false);
	}

	public Veggies(float price, boolean available, int bestBeforeDays, String veggiesType, boolean imported){
		setPrice(price);
		setAvailable(available);
		setBestBeforeDays(bestBeforeDays);
		setVeggiesType(veggiesType);
		setImported(imported);
	}
	
	public String getVeggiesType(){
		return veggiesType;
	}
	public void setVeggiesType(String VeggiesType){
		this.veggiesType = veggiesType;
	}
	
	public boolean getImported(){
		return imported;
	}
	public void setImported(boolean imported){
		this.imported = imported;
	}
}
