package stock;

public class Dessert extends Stock{
	private boolean diabeticFriendly;
	private int pieces;
	
	public Dessert(){
		setPrice(0f);
		setAvailable(false);
		setBestBeforeDays(0);
		setDiabeticFriendly(false);
		setPieces(0);
	}
	
	public Dessert(float price, boolean available, int bestBeforeDays, boolean diabeticFriendly, int pieces){
		setPrice(price);
		setAvailable(available);
		setBestBeforeDays(bestBeforeDays);
		setDiabeticFriendly(diabeticFriendly);
		setPieces(pieces);
	}
	
	public boolean getDiabeticFriendly(){
		return diabeticFriendly;
	}
	public void setDiabeticFriendly(boolean diabeticFriendly){
		this.diabeticFriendly = diabeticFriendly;
	}
	
	public int getPieces(){
		return pieces;
	}
	public void setPieces(int pieces){
		this.pieces = pieces;
	}
}
