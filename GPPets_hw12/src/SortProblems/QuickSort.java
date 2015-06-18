package SortProblems;

public class QuickSort {

	public static void quickSort(int[] testArr, int start, int end) {
		int i = start;
		int k = end;
		
		if ( (end - start) >= 1){
			int pivot = testArr[start];

			while (k > i){
				
				while (testArr[i] <= pivot && i <= end && k > i)
					i++;
				while (testArr[k] > pivot && k >= start && k >= i)
					k--;
				if (k > i)
					swap(testArr, i, k);
			}
			
			swap(testArr, start, k);
			
			quickSort(testArr, start, k - 1);
			quickSort(testArr, k + 1, end);
		} else return;
	}
	
	public static void swap(int[] testArr, int i, int j){
		int temp;
		temp = testArr[i];
		testArr[i] = testArr[j];
		testArr[j] = temp;
		
	}

}