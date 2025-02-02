import java.util.Scanner;

public class Problem7 {
	//Binary search of k in testArr[n]
	
	public static void main(String[] args) {
		
		int[] testArr = {3,4,5,5,5,6,7,12,13,24,35,57,68,79,80,81};
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter number k:");
		int k = input.nextInt();
		
		int i = 0;
		int l = testArr.length-1;
		int posArr = 0;
		int posK=-1;
		
		while(i <= l && posK==-1){
			posArr = (l+i)/2;
			
			if (k == testArr[posArr]){
				posK = posArr;
				
			} else if (k < testArr[posArr]){
				l = posArr - 1;
				
			} else if (k > testArr[posArr]){
				i = posArr + 1;
				
			}
			
		}
		
		if (posK!=0 && posK!=-1){
			System.out.println("k=" + k + " was found at " + posK + ".");
		} else {
			System.out.println("k=" + k + " was not found.");
		}
		
	}
}