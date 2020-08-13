package javaproject;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nested if...else Statement

		Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestnumber;

		// checks if n1 is greater than or equal to n2

		if (n1 >= n2) {

			if (n1 >= n3) {

				largestnumber = n1;
			} else {
				largestnumber = n3;
			}
		} else {

			if (n2 >= n3) {

				largestnumber = n2;
			} else {
				largestnumber = n3;

			}

		}
		
		System.out.println("largest number is"+ largestnumber);

	}

}
