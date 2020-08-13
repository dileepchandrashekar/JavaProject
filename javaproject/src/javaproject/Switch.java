package javaproject;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int week = 4;
		String day;

		switch (week) {

		case 1:
			day = "sunday";
			break;

		case 2:
			day = "Monday";
			break;

		case 3:
			day = "Tuesday";
			break;

		case 4:
			day = "wednesday";
			break;

		case 5:
			day = "Thrusday";
			break;

		case 6:
			day = "friday";
			break;

		case 7:
			day = "saturday";
			break;

		default:
			day = "invalid day";
			break;

		}

		System.out.println(day);

	}

}
