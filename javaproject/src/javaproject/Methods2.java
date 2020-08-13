package javaproject;

public class Methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("area of rectangle length is 5 width is 4");
		
		int area = areaRectangle(5,4);
		System.out.println(area);

	}
	
	public static int areaRectangle(int length, int width) {
		
		return length*width;
	
	}

}
