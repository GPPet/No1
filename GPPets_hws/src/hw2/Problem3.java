package hw2;

import java.util.Scanner;

public class Problem3 {
	//Personal information inquiry list
	
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in, "UTF-8");
        
        //Name
        System.out.println("Име");
        String perName = input.nextLine();  
        
        System.out.println("Презиме");
        String midName = input.nextLine();       
        
        System.out.println("Фамилия");
        String famName = input.nextLine();               
        
        //Age
        System.out.println("Възраст");
        byte age = input.nextByte();
        input.nextLine();
        
        //Gender
        System.out.println("Пол");
        Scanner reader = new Scanner(System.in);
        char gen = reader.next().charAt(0); //Only 1st character.
        
        //EGN
        System.out.println("ЕГН");
        long egn = input.nextLong();

        //Phone number
        System.out.println("Телефон");
        long phone = input.nextLong();
        
        //Print out information
        System.out.println("Име"+"\t"+"Презиме"+"\t"+"Фамилия"+"\t"+"Възраст"+"\t"+"Пол"+"\t"+"ЕГН"+"\t"+"Телефон");
        System.out.printf(perName+"\t"+midName+"\t"+famName+"\t"+age+"\t"+gen+"\t"+egn+"\t"+phone);

    }
}
