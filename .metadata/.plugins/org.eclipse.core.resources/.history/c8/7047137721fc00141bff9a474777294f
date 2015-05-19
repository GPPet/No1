import java.util.Scanner;

public class Problem9 {
	//Fill in array's elements, a x a
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter matrix size a:");
		int a = input.nextInt();
		
		//int a = 6;
		int[][] twoDRev = new int[a][a];
		int i = 1;
		
		for(int col = 0; col < twoDRev.length; col++){
			for(int row = 0; row < twoDRev[col].length; row++){
						twoDRev[row][col] = i++;
			}
		}
		
		for(int row = 0; row < twoDRev.length; row++){
			for(int col = 0; col < twoDRev[row].length; col++){
						System.out.print(twoDRev[row][col] + "\t");
				}
			System.out.println();
		}
		
		System.out.println();
		
		i = 1;
		
		for(int row = 0; row < twoDRev.length; row++){
			for(int col = 0; col < twoDRev[row].length; col++){
						twoDRev[row][col] = i++;
						System.out.print(twoDRev[row][col] + "\t");
				}
			System.out.println();
		}
		
	}		
}