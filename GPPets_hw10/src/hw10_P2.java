import java.util.HashMap;
import java.util.Scanner;


public class hw10_P2 {

	public static void main(String[] args) {
		// ННапишете програма, която приема текст и извежда на екрана всички думи, които са уникални (срещат се само веднъж).
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please, enter the words:");
//		String text = input.nextLine();
		
		String text = "We are living in a yellow submarine. We don't have anything else. Inside the submarine is very tight. So we are drinking all the day.";
		text = text.toLowerCase();
		
		String[] splitText = text.split("[ ,.!]");
		
		int count = 0;
		
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		for(String word : splitText){
			if(word != "") wordCount.putIfAbsent(word, count);
		}
		
		for(String word : wordCount.keySet()){
			count = 0;
			for(int i = 0; i < splitText.length; i++){
				if(splitText[i].equals(word)) count++;
			}
			wordCount.put(word, count);
		}
		
		System.out.print("Unique words: " ); 
		for(String word : wordCount.keySet()){
			if(wordCount.get(word)==1) System.out.print(word + " ");
		}
		
		System.out.println();
		
		System.out.println("Not unique words: " ); 
		for(String word : wordCount.keySet()){
			if(word!="" && wordCount.get(word)!=1) System.out.println(word + " : " + wordCount.get(word));
		}

	}

}
