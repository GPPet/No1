public class Problem8 {
	//Bubble sort of testArr[n]
	
	public static void main(String[] args) {
		
		int[] testArr = {9,109,357,2,38,5,3,9,0,3,2,7,34,67};
		
		int i = 0;
		int j = 0;
		int l = testArr.length -1;
		int temp = 0;
		
		for(i = 0; i < l; i++){
			for (j = 0; j < l; j++){
				if (testArr[j] >= testArr[j+1]){
					temp = testArr[j];
					testArr[j] = testArr[j+1];
					testArr[j+1] = temp;
				}
			}
		}
		
		for (i = 0; i < l; i++){
			System.out.print(testArr[i] + " ");
		}
		
	}
}