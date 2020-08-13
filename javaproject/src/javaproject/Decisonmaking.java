package javaproject;

public class Decisonmaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 4;
		if(x != 5) {
			System.out.println("value of x is not = 5");
		}else {
		System.out.println("equal to 5");
		}
		
		int a = 4;
		int b = 5;
		
		if (a<b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//&&(and operator)
		//||(or operator)
		//!operator
		
		boolean d = true;
		boolean e = false;
		
		if (d && e) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		int u = 4;
		int v = 5;
		
		if (!((u<v) && (v>u))) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}	
			
	}

}
