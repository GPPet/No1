import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// Numbers to words
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		/*System.out.println("Please enter an integer a\u22f2 [0;9]:");
		int numA = input.nextInt();
		or:*/
		int numA = 90;
		
		switch (numA) {
	        case 0:
	        	System.out.println(numA + " => zero");
	        	break;
	        case 1:
	        	System.out.println(numA + " => one");
	        	break;
            case 2:
                System.out.println(numA + " => two");
                break;
            case 3:
                System.out.println(numA + " => three");
                break;
            case 4:
                System.out.println(numA + " => four");
                break;
            case 5:
                System.out.println(numA + " => five");
                break;
            case 6:
                System.out.println(numA + " => six");
                break;
            case 7:
                System.out.println(numA + " => seven");
                break;
            case 8:
                System.out.println(numA + " => eight");
                break;
            case 9:
                System.out.println(numA + " => nine");
                break;
            default:
                System.out.println("Error! a \u2209 [0;9].");
                break;
        }		
	}
}
