package hw2;

import java.util.Scanner;

public class Problem8 {
	//Odd or even number (divisibility by 2)
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter an integer: ");
		int num = input.nextInt();
		
		boolean even = num % 2 == 1;
		System.out.println(num + " is an odd number: " + even);
		
	}
}
