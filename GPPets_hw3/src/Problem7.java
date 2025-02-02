import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// Quadratic equation
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		/*System.out.println("Please, enter a, b, and c: ");
		int numA = input.nextInt();
		int numB = input.nextInt();
		int numC = input.nextInt();
		or:*/
		int numA = 1;
		int numB = 2;
		int numC = 5;
		
		//Check whether a = 0:
		if (numA == 0){
			System.out.println("The equation is linear (a = 0)!");
			System.out.println("x = -c/b = " + "-" + numC + "/" + numB);
		} else {
			//Calculate discriminant
			double delta = Math.pow(numB,2) - 4*numA*numC;
			double deltaSQRT = Math.sqrt(delta);
			System.out.println("\u2206 = " + delta);
			if (delta == 0){
			System.out.println("x1 = x2 = -b/(2a) = " + "-" + numB + "/" + 2*numA); 
		} else if (delta > 0){
			System.out.println("x1 = -(b + \u221A \u2206)/(2a) = " + "-(" + numB + "+" + deltaSQRT + ")/" + 2*numA);
			double x1 = numB + deltaSQRT; 
			System.out.println("x1 = -" + x1 + "/" + 2*numA);
			System.out.println("x2 = -(b - \u221A \u2206)/(2a) = " + "-(" + numB + "-" + deltaSQRT + ")/" + 2*numA);
			double x2 = numB - deltaSQRT; 
			System.out.println("x2 = -" + x2 + "/" + 2*numA);
		} else if (delta < 0){
			System.out.println("x1 = -(b + i \u221A \u2206)/(2a) = " + "-(" + numB + " + i \u221A " + delta + ")/" + 2*numA);
			System.out.println("x2 = -(b - i \u221A \u2206)/(2a) = " + "-(" + numB + " - i \u221A " + delta + ")/" + 2*numA);
		}
		}
		
	}
}

