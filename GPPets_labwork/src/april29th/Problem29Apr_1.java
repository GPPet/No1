package april29th;

import java.util.Scanner;

public class Problem29Apr_1 {
	// Problem 1 from Lecture No3, 29th April

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter a word: ");
		String word = input.nextLine();
		
		System.out.println("Please enter two integers, a and b: ");
		int numA = input.nextInt();
		int numB = input.nextInt();
		
		boolean word10 = word.length() < 10;
		System.out.println("The word contains less than 10 characters:\n" + word10 + "\n");
		
		boolean aIsMore = numA > numB;
		System.out.println("a(=" + numA + ") > b(=" + numB + "):\n" + aIsMore + "\n");
		
		boolean bIsInRange = (numB >= -150) && (numB < 15);
		System.out.println("Does b(=" + numB + ") belong to [-150;15)?\n" + bIsInRange + "\n");
		
		int aOverB = numA % numB;
		System.out.println("The remainder of a/b is: " + aOverB + "\n");
		
		boolean aOrB = (numA > 10) || (numB < 88);
		System.out.println("Check whether a > 10 or b < 88: " + aOrB + "\n");
		
	}
}
