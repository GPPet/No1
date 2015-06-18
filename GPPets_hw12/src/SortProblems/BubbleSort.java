package SortProblems;

public class BubbleSort {
	
	public static void bubbleSort(int[] testArr) {	
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
	}
}
