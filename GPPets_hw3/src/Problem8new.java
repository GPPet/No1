public class Problem8new {

	public static void main(String[] args) {
		// Find the maximum of 5 integers
		
		int numA = 12;
		int numB = 37;
		int numC = 35;
		int numD = 3;
		int numE = 9;
		int max;
		
		if (Math.max(numA, numB) < numC){
			max = numC;
		} else {
			max = Math.max(numA, numB);
		}
		
		if (Math.max(max, numD) < numE){
			max = numE;
		} else {
			max = Math.max(max, numD);
		}
		
		System.out.println("The maximum of (" + numA + ", " + numB + ", " + numC + ", " + numD + ", and " + numE + ") is " + max);
		
	}
	
}
