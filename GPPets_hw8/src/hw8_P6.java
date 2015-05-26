import java.util.Scanner;


public class hw8_P6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer, N:");
		int N = input.nextInt();
		long factorialN = recursiveFactorial(N);
		System.out.println("N! = " + factorialN);

	}
	
	public static long recursiveFactorial(int n){
		if (n==1){
			//System.out.println("first: " + 1);
			return 1;
		}
		//System.out.println("last: " + n);
		return n * recursiveFactorial(n-1);
	}

}
