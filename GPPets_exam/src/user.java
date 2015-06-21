import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


public class user {

	public static void main(String[] args) {
		MatrixConverter test = new MatrixConverter();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter the size of the matrix:");
		int n = input.nextInt();
		test.setSize(n);
		int[] oneD = new int[n*n];
		int[][] twoD = new int[n][n];
		
		System.out.println("For 1D to 2D enter \"1\"; for 2D to 1D enter \"2\"" );
		int testN = input.nextInt();
		
		if(testN == 1){
			for(int i = 0; i < oneD.length; i++){
				System.out.println("Please enter a number:");
				oneD[i] = input.nextInt();
			}
			twoD = test.convertMatrix(oneD);
//			System.out.println(test.twoDtoString(twoD));
			
			
		} else if(testN == 2){
			for(int row = 0; row < twoD.length; row++){
				for(int col = 0; col < twoD[0].length; col++){
					System.out.println("Please enter a number:");
					twoD[row][col] = input.nextInt();
				}
			}
			oneD = test.convertMatrix(twoD);
//			System.out.println(test.oneDtoString(oneD));
			
		} else System.out.println("Wrong choice!");
		
		
		String filePath = "../matrices.txt";
		
		try {
			FileWriter fileStream = new FileWriter(filePath);
			BufferedWriter writer = new BufferedWriter(fileStream);
			
			System.out.println("OneD matrix: ");
			writer.write("OneD matrix: ");
			writer.newLine();
			System.out.println(test.oneDtoString(oneD));
			writer.write(test.oneDtoString(oneD));
			writer.newLine();
			
			System.out.println("TwoD matrix: ");
			writer.write("TwoD matrix: ");
			writer.newLine();
			System.out.println(test.twoDtoString(twoD));
			writer.write(test.twoDtoString(twoD));
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("The file is succes.");
	}
		

	

}
