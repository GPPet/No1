package may08th;

public class Problem3 {
	//Copy one array elements into another's
	
	public static void main(String[] args) {
		
		int[] one = new int[12];
		int n = one.length;
		int[] two = new int[n];
		
		
		for(int i = 0; i < n; i++){
			one[i] = i*2;
			System.out.print(one[i] + " ");
		}
		
		one[9] = 123;
		one[11] = 0;
		
		System.out.println();
		
		for(int i = 0; i < n; i++){
			two[i] = one[i];
			System.out.print(two[i] + " ");
		}
		
	}
		
		
}