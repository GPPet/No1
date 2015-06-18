package SortProblems;

public class MergeSort {
	
	public static void sort(int[] testArr) {
        doMergeSort(testArr, 0, testArr.length - 1);
    }
	
	private static void doMergeSort(int[] testArr, int indexLow, int indexHigh){
		if (indexLow < indexHigh) {
			int indexMid = indexLow + (indexHigh - indexLow) / 2;
			
			doMergeSort(testArr, indexLow, indexMid);
			doMergeSort(testArr, indexMid + 1, indexHigh);
			mergeParts(testArr, indexLow, indexMid, indexHigh);
		}
	}

	private static void mergeParts(int[] testArr, int indexLow, int indexMid, int indexHigh) {
		int[] tempArr = new int[testArr.length];

		for (int i = indexLow; i <= indexHigh; i++) {
			tempArr[i] = testArr[i];
		}
		
		int i = indexLow;
		int j = indexMid + 1;
		int k = indexLow;
		
		while (i <= indexMid && j <= indexHigh) {
			if (tempArr[i] <= tempArr[j]) {
				testArr[k] = tempArr[i];
				i++;
			} else {
				testArr[k] = tempArr[j];
				j++;
			}
			k++;
		}
		
		while (i <= indexMid) {
			testArr[k] = tempArr[i];
			k++;
			i++;
		}
		
	}

}
