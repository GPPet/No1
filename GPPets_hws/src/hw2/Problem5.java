package hw2;

import java.util.Scanner;

public class Problem5 {
	//Sum of four numbers entered by user
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please, enter the four numbers to be summed: ");
		int a1 = input.nextInt();
		int a2 = input.nextInt();
		int a3 = input.nextInt();
		int a4 = input.nextInt();
		
		int sum = a1+a2+a3+a4;
		
		System.out.println("\u03A3 (" + a1 + " + " + a2 + " + " + a3 + " + " + a4 + ") = " + sum);
		
		
	}
}