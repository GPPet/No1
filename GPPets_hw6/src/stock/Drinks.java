package stock;

public class Drinks extends Stock{
	private boolean alcohol;
	private int bottles;
	
	public Drinks(){
		setPrice(0f);
		setAvailable(false);
		setBestBeforeDays(0);
		setAlcohol(false);
		setBottles(0);
	}

	public Drinks(float price, boolean available, int bestBeforeDays, boolean alcohol, int bottles){
		setPrice(price);
		setAvailable(available);
		setBestBeforeDays(bestBeforeDays);
		setAlcohol(alcohol);
		setBottles(bottles);
	}
	
	public boolean getAlcohol(){
		return alcohol;
	}
	public void setAlcohol(boolean alcohol){
		this.alcohol = alcohol;
	}
	
	public int getBottles(){
		return bottles;
	}
	public void setBottles(int bottles){
		this.bottles = bottles;
	}
}
