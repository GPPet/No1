import java.util.Scanner;

public class hw9_P1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter a word: ");
		String word = input.nextLine();
		mirrorWord(word);

	}
	
	public static void mirrorWord(String word){
		String[] reflection = word.split("");
		for (int i = 0; i < reflection.length; i++){
			System.out.print(reflection[i]);
		}
		System.out.print(" | ");
		for (int i = 0; i < reflection.length; i++){
			System.out.print(reflection[reflection.length -1 - i]);
		}
		
	}

}
