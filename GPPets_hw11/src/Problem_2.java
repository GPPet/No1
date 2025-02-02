import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Problem_2 {

	public static void main(String[] args) {
		// Напишете програма, която маха определени думи (по-къси от 3 символа) от изречение Използвайте опашка.
		
		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a sentence:");
//		String sentence = input.nextLine();
		
		String sentence = "My spaceship is ready for travelling to Mars";
		System.out.println("Original:\n" +  sentence);
		
		System.out.println("\nAll words shorter than 3 are removed:");
		String[] stringSentence = sentence.split("[ .,?!]");
		
		Queue<String> queueSentence = new LinkedList<String>();
		
		for(String word : stringSentence){
			queueSentence.offer(word);
		}
		
		String moreThan3 = "";
		for(String word : queueSentence){
			if (word.length() > 3){
				moreThan3 += word + " ";
			}
		}
		System.out.println(moreThan3);

	}

}
