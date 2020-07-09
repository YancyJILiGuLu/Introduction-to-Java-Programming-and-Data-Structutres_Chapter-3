package chapter3;

import java.util.Scanner;

public class Q3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter today's day: (0 for Sunday,1 for Monday,2 for Tuesday,"
				+ "3 for Wednesday,4 for Thursday,5 for Firday,6 for Saturday)");
		int today =  input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today:");
		int days =  input.nextInt();
		
		switch ((today+days) %7) {
		case 0:System.out.print("Sunday"); break;
		case 1:System.out.print("Monday"); break;
		case 2:System.out.print("Tuesday");break;
		case 3:System.out.print("Wednesday");break;
		case 4:System.out.print("Thurday");break;
		case 5:System.out.print("Firday");break;
		case 6:System.out.print("Saturday");break;
		
		
		}

	}

}
