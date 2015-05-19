package CelsiusConvertor;

public class CelsiusConvertor {
	protected static float degC;
	protected static float degF;
	protected static float degK;
	
	public CelsiusConvertor(){
		this.degC = 0f;
	}
	
	public CelsiusConvertor(float degC){
		this.degC = degC;
	}
	
	public static void convert(){
		degF = degC*(9/5) + 32;
		degK = degC + 273.15f;
		System.out.println(degC + "oC are " + degF + "oF and " + degK + "oK.");
	}

}
