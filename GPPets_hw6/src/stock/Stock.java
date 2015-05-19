package stock;

public abstract class Stock {
	protected float price;
	protected boolean available;
	protected int bestBeforeDays;

	public float getPrice(){
		return price;
	}
	public void setPrice(float price){
		this.price = price;
	}
	
	public boolean getAvailable(){
		return available;
	}
	public void setAvailable(boolean available){
		this.available = available;
	}
	
	public int getBestBeforeDays(){
		return bestBeforeDays;
	}
	public void setBestBeforeDays(int bestBeforeDays){
		this.bestBeforeDays = bestBeforeDays;
	}
	
}
