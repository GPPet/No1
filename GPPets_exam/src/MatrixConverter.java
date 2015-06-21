
public class MatrixConverter {
	private int size;
	private int[] oneD;
	private int[][] twoD;
	
	public MatrixConverter(){
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		if ((size >= 2) && (size <= 9) ) this.size = size;
		else System.out.println("The number is out of range!");
	}
	public int[] getOneD() {
		return oneD;
	}
	public void setOneD(int[] oneD) {
		this.oneD = oneD;
	}
	public int[][] getTwoD() {
		return twoD;
	}
	public void setTwoD(int[][] twoD) {
		this.twoD = twoD;
	}
	
	public int[][] convertMatrix(int[] oneD){
		twoD = new int[getSize()][getSize()];
		int i = 0;
		while(i < getSize()*getSize()){
			for(int col = 0; col < twoD[0].length; col++){
				for(int row = 0; row < twoD.length; row++){
					twoD[row][col] = oneD[i]*i ;
					i++;
				}
			}
		}
		
		return twoD;
	}
	
	
	public int[] convertMatrix(int[][] twoD){
		int n = getSize();
		int[] oneD = new int[n*n];
		int i = 0;
		while(i < oneD.length){
			for(int col = 0; col < twoD[0].length; col++){
				for(int row = 0; row < twoD.length; row++){
					oneD[i] = i*twoD[row][col];
					i++;
				}
			}
		}
		
		return oneD;
	}
	
	
	public String twoDtoString(int[][] twoD){
		String result = "";
		for(int row = 0; row < twoD.length; row++){
			for(int col = 0; col < twoD[0].length; col++){
				result += twoD[row][col] + "\t| ";
			}
			result += "\n";
			for(int col = 0; col < twoD[0].length; col++){
				result += "____" + "\t| ";
			}
			result += "\n";
		}
		return result;
	}
	
	public String oneDtoString(int[] oneD){
		String result = "";
		for(Integer num : oneD){
			result += num + " ";
		}
		return result;
	}
}
