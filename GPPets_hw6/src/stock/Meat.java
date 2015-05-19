package stock;

public class Meat extends Stock{
	private String meatType; //chicken, beef, pork, etc.
	private float kilo; //available amount
	private boolean frozen; //frozen or fresh
	
	public Meat(){
		setPrice(0f);
		setAvailable(false);
		setBestBeforeDays(0);
		setMeatType("");
		setKilo(0f);
		setFrozen(false);
	}
	
	public Meat(float price, boolean available, int bestBeforeDays, String meatType, float kilo, boolean frozen){
		setPrice(price);
		setAvailable(available);
		setBestBeforeDays(bestBeforeDays);
		setMeatType(meatType);
		setKilo(kilo);
		setFrozen(frozen);
	}

	public String getMeatType(){
		return meatType;
	}
	public void setMeatType(String meatType){
		this.meatType = meatType;
	}
	
	public float getKilo(){
		return kilo;
	}
	public void setKilo(float kilo){
		this.kilo = kilo;
	}
	
	public boolean getFrozen(){
		return frozen;
	}
	public void setFrozen(boolean frozen){
		this.frozen = frozen;
	}

}
