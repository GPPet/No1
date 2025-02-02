import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// Numbers in words
		
		//Scanner input = new Scanner(System.in, "UTF-8");
		//System.out.println("Number: ");
		//int num = input.nextInt();
		
		int num = 999;
		String numXXX = "";
		
		if ((num < 100) & (num >=10) ){
			numXXX = "0" + num;		
		} else if (num < 10) {
			numXXX = "00" + num; 	
		} else {
			numXXX = "" + num;
		}
		
		int hundred = Character.digit(numXXX.charAt(0),10);
		int ten = Character.digit(numXXX.charAt(1),10);
		int digit = Character.digit(numXXX.charAt(2),10);
		
		//System.out.println(numXXX + ":" + hundred + ten + digit);
		
		String hundredStr = "";
		String tenStr = "";
		String digitStr = "";
		
		switch (hundred) {
			case 1: 
				hundredStr = "one hundred";
				break;
			case 2: 
				hundredStr = "two hundred";
				break;
			case 3: 
				hundredStr = "three hundred";
				break;
			case 4: 
				hundredStr = "four hundred";
				break;
			case 5: 
				hundredStr = "five hundred";
				break;
			case 6: 
				hundredStr = "six hundred";
				break;
			case 7: 
				hundredStr = "seven hundred";
				break;
			case 8: 
				hundredStr = "eight hundred";
				break;
			case 9: 
				hundredStr = "nine hundred";
				break;
		}
		
		
		switch (ten) {
			case 1:
				if (digit == 0){
					tenStr = "ten";
				} else {
					switch (digit) {
						case 1:
							tenStr = "eleven";
							break;
						case 2:
							tenStr = "twelve";
							break;
						case 3:
							tenStr = "thirteen";
							break;
						case 4:
							tenStr = "fourteen";
							break;
						case 5:
							tenStr = "fifteen";
							break;
						case 6:
							tenStr = "sixteen";
							break;
						case 7:
							tenStr = "seventeen";
							break;
						case 8:
							tenStr = "eighteen";
							break;
						case 9:
							tenStr = "nineteen";
							break;
						}
						}
						break;
        			case 2: 
        				tenStr = "twenty";
        				break;
        			case 3: 
        				tenStr = "thirty";
        				break;
        			case 4: 
        				tenStr = "fourty";
        				break;
        			case 5: 
        				tenStr = "fifty";
        				break;
        			case 6: 
        				tenStr = "sixty";
        				break;
        			case 7: 
        				tenStr = "seventy";
        				break;
        			case 8: 
        				tenStr = "eighty";
        				break;
        			case 9: 
        				tenStr = "ninety";
        				break;	
        }
		
		if ((ten != 1) | (ten == 0)){
			switch (digit) {
				case 0:
					if ((ten == 0) & (hundred == 0)){
						digitStr = "zero";
					}
				break;
				case 1:
					digitStr = "one";
				break;
				case 2:
					digitStr = "two";
				break;
				case 3:
					digitStr = "three";
				break;
				case 4:
					digitStr = "four";
				break;
				case 5:
					digitStr = "five";
				break;
				case 6:
					digitStr = "six";
				break;
				case 7:
					digitStr = "seven";
				break;
				case 8:
					digitStr = "eight";
				break;
				case 9:
					digitStr = "nine";
				break;
			}
		}
		
		if (ten == 0){
			System.out.println(num + " => " + hundredStr + " " + digitStr);
		} else if (ten == 1){
			System.out.println(num + " => " + hundredStr + " " + tenStr);
		} else if ((ten != 1) & (digit == 0)){
			System.out.println(num + " => " + hundredStr + " " + tenStr);
		} else {
			System.out.println(num + " => " + hundredStr + " " + tenStr + "-" + digitStr);
		}
		
	}
}