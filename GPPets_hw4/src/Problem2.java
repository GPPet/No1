import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter n");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++){
			
			if ((i % 3 == 0) && (i % 7 == 0) ){
				continue;
			}
			
			System.out.println(i);
			
		}
		
	}

}
