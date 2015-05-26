package cars;

public class SUV extends Car{
	protected boolean highlander;
	
	public SUV(){
	//	super();
		
	//	this.highlander = false;
	}
	
	public SUV(int price, boolean highlander){
		super(price);
		
		setHighlander(highlander);
	}
	
	public boolean getHighlander(){
		return highlander;
	}
	
	public void setHighlander(boolean highlander){
		this.highlander = highlander;
	}

}
