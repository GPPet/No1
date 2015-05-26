package may20th;

import java.util.Scanner;

public class Problem20May_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter the size of the array, n:");
		int n = input.nextInt();
		int[] intArr = new int[n];
		
		inputArray(intArr);
		//inputUserArray(intArr);

		printArray(intArr);
		
		reverseArray(intArr);
		
		int[] revArr = reverseArray(intArr);
		printArray(revArr);

	}
	
	
	
	public static void inputArray(int[] arr){
		for (int i = 0; i < arr.length; i++){
			arr[i] = i+1;
			//System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void inputUserArray(int[] arr){
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++){
			System.out.println("Please, enter A[" + i + "]:");
			arr[i] = input.nextInt();
		} 
		System.out.println();
	}
	
	public static void printArray(int[] arr){
		System.out.println("Array:");
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] reverseArray(int[] arr){
		int[] revArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++){
			revArr[i] = arr[arr.length -1 -i];
		}
		return revArr;
	}

}
