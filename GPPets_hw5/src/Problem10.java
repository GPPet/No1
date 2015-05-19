import java.util.Scanner;

public class Problem10 {
	//Fill in array's elements, a x a
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter matrix size [a][b]:");
		int a = input.nextInt();
		int b = input.nextInt();
		
		int[][] twoD = new int[a][b];
		int row1 = 0;
		int row2 = a - 1;
		int col1 = 0;
		int col2 = b - 1;
		int k = 1;
		
		while (k <= a*b ){
			for(int i = col1; i <= col2; i++){
				twoD[row1][i] = k++;
			}
			for(int j = row1 + 1; j <= row2; j++){
				twoD[j][col2]=k++;
			}
			for(int i = col2 - 1; i >= col1; i--){
				twoD[row2][i]=k++;
			}
			for(int j = row2 - 1; j >= row1 + 1; j--){
				twoD[j][col1]=k++;
			}
			
			col1++;
			col2--;
			row1++;
			row2--;
		}
		
		System.out.println("Matrix:");
        for(int i=0; i < a; i++) {
                for(int j = 0; j < b; j++)
                    {
                        System.out.print(twoD[i][j]+ "\t");
                    }
             System.out.println();
        }
    }	
}