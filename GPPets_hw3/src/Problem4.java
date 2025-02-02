import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// Check whether a, b, c are sides of a triangle
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		/*System.out.println("Please enter three integers, a, b and c: ");
		int numA = input.nextInt();
		int numB = input.nextInt();
		int numC = input.nextInt();
		or:*/
		int numA = 12;
		int numB = 37;
		int numC = 35;
		
		//Check whether a, b, c are positive and not zero:
		if (numA <= 0){
			System.out.println("a is invalid!");
		}
		if (numB <= 0){
			System.out.println("b is invalid!");
		}
		if (numC <= 0){
			System.out.println("c is invalid!");
		}
		
		
		//Define maximum
		if (Math.max(numA, numB) > numC){
			int eqC = Math.max(numA,numB);
			int eqA = Math.min(numA,numB);
			int eqB = numC;
			double sumEqAB = Math.pow(eqA,2) + Math.pow(eqB,2);
			double c2 = Math.pow(eqC,2);
			if (sumEqAB < c2){
				System.out.println("a, b, and c are sides of a triangle.");
			} else if (sumEqAB == c2){
				System.out.println("a, b, and c are sides of a right triangle.");
			} else {
				System.out.println("a, b, and c cannot be the sides of a triangle.");
			}
		} else if (Math.max(numA, numB) < numC){
			int eqC = numC;
			int eqA = numA;
			int eqB = numB;
			double sumEqAB = Math.pow(eqA,2) + Math.pow(eqB,2);
			double c2 = Math.pow(eqC,2);
			if (sumEqAB < c2){
				System.out.println("a, b, and c are sides of a triangle.");
			} else if (sumEqAB == c2){
				System.out.println("a, b, and c are sides of a right triangle.");
			} else {
				System.out.println("a, b, and c cannot be the sides of a triangle.");
			}
		} 
		
	}
}
