package hw2;

import java.util.Scanner;

public class Problem7 {
	//Check whether an integer is divisible by 5 & 7
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter an integer: ");
		int num = input.nextInt();
		
		boolean result = (num % 5 == 0) && (num % 7 == 0);
		System.out.println(num + " is divisible by 5 & 7: " + result);
		
	}
}
