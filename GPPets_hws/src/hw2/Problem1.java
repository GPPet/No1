package hw2;

import java.util.Scanner;

public class Problem1 {
	// Calculating the area of a rectangle

    public static void main(String[] args) {
        System.out.println("Area of a rectangle");
        Scanner input = new Scanner(System.in, "UTF-8");

        System.out.println("Please, enter the height (a, in cm) and width (b, in cm) of the rectangle: ");
        float height = input.nextFloat();        
        float width = input.nextFloat();
        
        float square = height * width;
        System.out.println("The area of a rectangle with height a=" + height + "cm" + " and width b=" +
        width + "cm" +  " is: " + square + "cm\u00B2.");
    }
}
