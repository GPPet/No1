import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		int N, num, min, max;
		min = 0;
		max = 0;
		
		String ai = "";
		String all = "";
		
		System.out.println("Enter total number of integers N: ");
		N = input.nextInt();
		
		System.out.println("Enter the integers ai: ");
		
		for (int i=1; i<=N; i++){
			num = input.nextInt();
			ai = "a" + i;
			all = all + ai + " = " + num + "; ";
			
			if (i==1){
				min = num;
				max = num;
			}
			
			max = Math.max(num, max);
			min = Math.min(num, min);
		}
		
		
		System.out.println("numbers: " + all);
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		
	}

}
