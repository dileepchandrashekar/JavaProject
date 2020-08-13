package javaproject;


public class Methods3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method overloading
		
		System.out.println("carrying out arithematic operations");
		System.out.println("sum"+area(1.1, 2.1));
		System.out.println("sum"+area(1));
		System.out.println("sum"+area(1, 2));
		System.out.println("sum"+area(1, 2));
	}
	public static double area(double length ,double width) {
		
		return length*width;
	}
	
	public static double area(double side) {
		
		return side*side;
	}
	
	public static int area(int side, int wide) {
		
		return side+wide;
	}
   public static int area(int side, int wide) {
		
		return side-wide;
	}
}

		


