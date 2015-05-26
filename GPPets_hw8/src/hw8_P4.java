import java.util.Scanner;


public class hw8_P4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter an integer:");
		int a = input.nextInt();
		
		defineOddOrEven(a);
		
		//or
		
		if (a == 0){
			System.out.println("Zero!");
		} else if (checkIfEven(a) == true){
			System.out.println("The number is even!");
		} else if (checkIfEven(a) == false){
			System.out.println("The number is odd!");
		}
		

	}
	
	public static void defineOddOrEven(int number){
		if (number == 0){
			System.out.println("Zero!"); 
		} else if ((number % 2 == 0) && (number != 0)) {
			System.out.println("The number " + number + " is even!");
		} else {
			System.out.println("The number " + number + " is odd!");
		}
	}
	
	public static boolean checkIfEven(int number){
		boolean even;
		if (number % 2 == 0){
			even = true;
		} else {
			even = false;
		}
		return even;
	}

}
