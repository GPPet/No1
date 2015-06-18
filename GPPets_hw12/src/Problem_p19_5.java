import java.util.ArrayList;


public class Problem_p19_5 {

	public static void main(String[] args) {
		// Направете програма, която приема изречение и подрежда по азбучен ред всички думи от него.
		
		String text = "The true sign of intelligence is not knowledge but imagination.";
		text.toLowerCase();
		String[] splitText = text.toLowerCase().split("[\\|, ,.,!]", -1);
		for(String word : splitText) System.out.println(word);
		
		ArrayList<String> textAL = new ArrayList<String>();
		for(int i = 0; i < splitText.length; i++) textAL.add(splitText[i]);
		
		textAL.sort(null);
		for(String word : textAL) System.out.println(word);
		
	}

}
