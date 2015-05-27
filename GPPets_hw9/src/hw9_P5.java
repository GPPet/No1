import java.util.Scanner;


public class hw9_P5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter math equation:");
		String equation = input.nextLine();
		
		int eqLength = equation.length();
		int opening = 0;
		int closing = 0;
		
		for(int i = 0; i < eqLength; i++){
			char a = equation.charAt(i);
			if( (a == '{') || (a == '[') || (a =='(') ){
				opening++;
				continue;
			}
			
			if( (a == '}') || (a == ']') || (a == ')') ){
				closing++;
	        }
		}
		
		if(opening != closing){
			System.out.println("Error in the brackets!");
		} else {
			System.out.println("Equation \"" + equation + "\" is correct!");
		}
	    
	}

}
