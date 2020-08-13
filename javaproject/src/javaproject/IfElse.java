package javaproject;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if statement

		int x = 10;

		if (x == 10) {
			System.out.println("true");
		}
		System.out.println("statement excutes anyway");
		
		// if then else statement
		int number = 10;

        // checks if number is greater than 0	 
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        else {
            System.out.println("The number is not positive.");
        }
 
        System.out.println("This statement is always executed.");
	}

}
