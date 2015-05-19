package stock;

public class Fruits extends Stock{
	private String fruitType; //apples, peaches, cherries, etc.
	private int amountAvailable;
	
	public Fruits(){
		setPrice(0f);
		setAvailable(false);
		setBestBeforeDays(0);
		setFruitType("");
		setAmountAvailable(0);
	}
	
	public Fruits(float price, boolean available, int bestBeforeDays, String FruitType, int amountAvailable){
		setPrice(price);
		setAvailable(available);
		setBestBeforeDays(bestBeforeDays);
		setFruitType(fruitType);
		setAmountAvailable(amountAvailable);
	}
	
	public String getFruitType(){
		return fruitType;
	}
	public void setFruitType(String fruitType){
		this.fruitType = fruitType;
	}
	
	public int getAmountAvailable(){
		return amountAvailable;
	}
	public void setAmountAvailable(int amountAvailable){
		this.amountAvailable = amountAvailable;
	}
	

}
