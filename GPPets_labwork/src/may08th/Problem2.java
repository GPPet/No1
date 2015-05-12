package may08th;

public class Problem2 {
	//Exchange array elements
	
	public static void main(String[] args) {
		
		int[] symm = new int[31];
		int n = symm.length;
		int a ;
		
		for(int i = 0; i < n; i++){
			symm[i] = i;
			System.out.print(symm[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < n; i++){
			symm[i] = i;
			a = i;
			symm[n-i-1] = a;
			symm[i] = n-a-1;
		}
		
		for(int i = 0; i < n; i++){
			System.out.print(symm[i] + " ");
		}

	}}