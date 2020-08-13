package javaproject;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] a = new int[3][4]; 2D
		// String[][][] data = new String[3][4][2]; 3D
		
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(a[2].length);
		System.out.println("________________________________");
		
		for (int i =0; i < a.length; i++) {
		
			for(int j=0; j < a[i].length; j++) {
				
				System.out.println(a[i][j]);
				
			}
				
		}
		System.out.println("________________________________");
		
		for(int[] Array:a) {
			for(int data:Array) {
				System.out.println(data);
			}
		}
		
	}

}
