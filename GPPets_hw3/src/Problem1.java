import java.util.Scanner;

public class Problem1 {
	// Problem 1: Is the quotient of two integers positive or negative?

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		//System.out.println("Please enter two integers, a and b: ");
		//int numA = input.nextInt();
		//int numB = input.nextInt();
		//or:
		int numA = -80;
		int numB = 20;
		
		if (((numA > 0) && (numB > 0)) || ((numA < 0) && (numB < 0) )){
			System.out.println("The quotient of a/b=" + numA + "/" + numB + " is a positive number.");
		} else if (((numA > 0) && (numB < 0)) || ((numA < 0) && (numB > 0) )){
			System.out.println("The quotient of a/b=" + numA + "/" + numB + " is a negative number.");
		} else if ((numA == 0) && (numB != 0)){
			System.out.println("The quotient of a/b=" + numA + "/" + numB + " is zero!");
		} else if (numB == 0){
			System.out.println("Error! The denominator is zero!");
		}
	}

}
