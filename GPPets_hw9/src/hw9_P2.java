import java.util.Scanner;

public class hw9_P2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter a word");
		String word = input.nextLine();
		System.out.println("Please, enter a sentence:");
		String sentence = input.nextLine();
		replaceWordInUpperCase(word,sentence);

	}
	
	public static void replaceWordInUpperCase(String word, String sentence){
		String upperWord = word.toUpperCase();
		String newSentence = sentence.replaceAll(word, upperWord);
		System.out.println(newSentence);
	}

}
