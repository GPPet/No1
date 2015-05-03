import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// Define the maximum in a set of data
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		/*System.out.println("Please enter three integers, a, b and c: ");
		int numA = input.nextInt();
		int numB = input.nextInt();
		int numC = input.nextInt();
		or:*/
		int numA = 90;
		int numB = -86;
		int numC = 34;
		
		//Check whether a,b,c are equal & define maximum:
		if ((numA == numB) && (numB == numC)){
			System.out.println("a = b = c!");
		} else if ((numA == numB) && (numA < numC) ){
			System.out.println("a = b < c => c = " + numC + " is the maximum.");
		} else if ((numA == numB) && (numA > numC) ){
			System.out.println("a = b > c => a = b = " + numA + " is the maximum.");
		} else if ((numB == numC) && (numB > numA) ){
			System.out.println("a < b = c => b = c = " + numB + " is the maximum.");
		} else if ((numB == numC) && (numB < numA) ){
			System.out.println("a > b = c => a = " + numA + " is the maximum.");
		} else if ((numA == numC) && (numA > numB) ){
			System.out.println("a = c > b => a = c = " + numA + " is the maximum.");
		} else if ((numA == numC) && (numA < numB) ){
			System.out.println("a = c < b => b = " + numB + " is the maximum.");
		}
		
		if ((numA > numB) && (numA > numC)){
			if (numB > numC){
				System.out.println("The maximum of a>b>c is " + "a=" + numA);
			} else if (numB < numC){
				System.out.println("The maximum of a>c>b is " + "a=" + numA);
			}
		} else if ((numB > numA) && (numB > numC)){
			if (numA > numC){
				System.out.println("The maximum of b>a>c is " + "b=" + numB);
			} else if (numA < numC){
				System.out.println("The maximum of b>c>a is " + "b=" + numB);
			}
		} else if ((numC > numA) && (numC > numB)){
			if (numA > numB){
				System.out.println("The maximum of c>a>b is " + "c=" + numC);
			} else if (numA < numB){
				System.out.println("The maximum of c>b>a is " + "c=" + numC);
			}
		}	
	}
}
