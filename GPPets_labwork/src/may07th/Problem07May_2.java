package may07th;

import java.util.Scanner;

public class Problem07May_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		int n ;
		int sum = 0;
		
		System.out.println("Enter n");
		
		do {
			n = input.nextInt();
			sum +=n;
		} while(n != 0);
		
		System.out.println("sum = " + sum);
			
	}
}
