import java.util.Scanner;

public class Problem5 {
	//All numbers in [a,b] for which %3 == 0
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter the range [a,b]:");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if (a>b){
			System.out.println("a > b! Please, re-enter the range [a,b]:");
			a = input.nextInt();
			b = input.nextInt();
		}
		
		
		int indexDiv3 = 0;
		int nDiv3 = 0;
		
		for (int i = a; i <=b; i++){
			if (i % 3 == 0){
				nDiv3++;
			}
		}
		
		int[] div3 = new int[nDiv3];  
		
		for (int i = a; i <=b; i++){
			if (i % 3 == 0){
				div3[indexDiv3] = i;
				indexDiv3++;
			}
		}
		
		for(int i = 0; i < div3.length; i++){
			System.out.print(div3[i] + " ");
		}
				
		System.out.println();
		
	}

}
