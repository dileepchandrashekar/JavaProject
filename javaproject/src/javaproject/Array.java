package javaproject;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dataType[] arrayName;
		
		//Day = new String[7];
		
		int[] age;
		age = new int[5];
		
		
		String[] day = new String[7];
		
		System.out.println(day[0]);
		
		int[] a = {1,2,3,4,5};
		System.out.println(a[1]);
		
		
		String[] b = {"heloo","Hi","Bye"};
		
		for(int i=0; i < b.length; i++) {
			
			System.out.println(b[i]);
		}
		System.out.println(b.length);
		
		for(String greetings:b) {
			
			System.out.println(greetings);
		}
			

	}

}
