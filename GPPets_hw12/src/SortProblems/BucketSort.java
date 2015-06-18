package SortProblems;

public class BucketSort {
	
	public static void bucketSort(int[] testArr){
		int max = testArr[0];
		for(int i = 0; i < testArr.length; i++) if(max < testArr[i]) max=testArr[i];
		
		int[] bucket = new int[max+1];
		
		for(int i = 0; i < testArr.length; i++) bucket[testArr[i]]++;

		int index = 0;
		for(int i = 0; i < bucket.length; i++){
			for(int b = 1; b <= bucket[i];b++){
				testArr[index] = i;
				index++;
			}
			
		}		
	}
	
}