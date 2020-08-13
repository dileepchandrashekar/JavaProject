package javaproject;

import java.util.Scanner;

public class IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // closing the scanner object
        input.close();
		

	}

}
