package javaproject;

import java.math.BigDecimal;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 2147483647;
		int min = -2147483648;
		
		short shortMax = 32767;
		short shortMin = -32768;
		
		long longMax = 9223372036854775807L;
		long longmin = -9223372036854775808L;
		
		byte byteMax =  127;
		byte byteMin = -128;
		
		int value1 = 9/2;
		float value2 = 9f/2f;
		double value3 = 9d/2d;
		
		//check with 10/6 do understand the precision between float and double
		
		System.out.println("value 1 = "+value1);
		System.out.println("value 2 = "+value2);
		System.out.println("value 3 = "+value3);
		
		
		boolean var = false;
		System.out.println(var);
		
		char var1 = '&';
		System.out.println(var1);
		
		//Big Decimal 
		
		double x = 1.05;
		double y =2.55;
		
		BigDecimal d1 = new BigDecimal("1.05");
		BigDecimal d2 = new BigDecimal("2.55");
		
		
		System.out.println(d1.add(d2));
		
		
		
		
		

	}

}
