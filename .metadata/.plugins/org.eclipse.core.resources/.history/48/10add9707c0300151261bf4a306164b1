import java.util.Scanner;


public class hw9_P3new  {
	
	
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please, enter the sentence:");
//		String text = input.nextLine();
		String text = "Chemistry is like magic. I love theoretical chemistry! Quantum chemistry, a field of chemistry, is very interesting.";
		
		String[] splittedText = text.split(" |, |!");
		
		for (String part : splittedText) {
			System.out.println(part);
		}
		
//		System.out.println("Please, enter a word to search:");
//		String word = input.nextLine();
		
		String word = "chemistry";
		
		int counter = 0;
		
		for (String part : splittedText) {
			
			if ( part.toLowerCase().equals(word)){
				counter++;
			}
		}
				
		System.out.println(counter);

	}

}
