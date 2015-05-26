package may22th.Sentence;

import java.util.Scanner;

public class Sentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.println("Please, enter the sentence:");
		//String sentence = input.nextLine();
		String sentence = "Greeting traveler, do you want a cup of fresh water.";
		
		boolean startsWith = sentence.startsWith("Greeting");
		boolean endsWith = sentence.endsWith(".");
		boolean containsH2O = sentence.contains("water");
		boolean containsLemonJuice = sentence.contains("lemon juice");
		
		System.out.format("The sentence begins with \"Greetings\": \t" + startsWith + "\n");
		System.out.format("The sentence ends with a dot: \t" + endsWith + "\n");
		System.out.format("The sentence contains \"water\": \t" + containsH2O + "\n");
		System.out.format("The sentence contains \"lemon juice\": \t" + containsLemonJuice + "\n");
		

	}

}
