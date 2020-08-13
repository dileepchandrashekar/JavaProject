package javaproject;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//number = (expression) ? expressionTrue : expressinFalse;
		
		/*Here, expression is a boolean expression which evaluates to either true or false. If it evaluates to true,
		expressionTrue is evaluated and assigned to variable number. If it evaluates to False, expressionFalse is 
		evaluated and assigned to variable number.*/
		
		boolean x; 
		 
		x = (5<4) ?true:false;
		System.out.println(x);
		
		Double number = -5.5;
	    String result;
	      
	      result = (number > 0.0) ? "positive" : "not positive";
	      System.out.println(number + " is " + result);
	      
	      int y = 10;
	      
	      y = (10 == 10) ? 1:0;
	      System.out.println(y);
	    		  
	    		  
				
	}

}
