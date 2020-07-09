package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println("Enter a year(e.g.,2012):");
		int year = input.nextInt();
		System.out.println("Enter a month(1for January,2 for February,3 for march...:");
		int m = input.nextInt();
		System.out.println("Enter the day of the month:");
		int q = input.nextInt();
		
		if (m==1 ) {
			m=13;
			year = year-1;
		}
		else if (m==2) {
			m=14;
			year = year-1;
		}
		int j=year/100;
		int k=year%100;
		
		int answer = (q + (26*(m+1)/10)+k+(k/4)+(j/4)+5*j)%7;
		switch (answer) {
		case 0: System.out.print("Day of the week is Saturday");break;
		case 1: System.out.print("Day of the week is Sunday");break;
		case 2: System.out.print("Day of the week is Monday");break;
		case 3: System.out.print("Day of the week is Tuesday");break;
		case 4: System.out.print("Day of the week is Wednesday");break;
		case 5: System.out.print("Day of the week is Thurday");break;
		case 6: System.out.print("Day of the week is Firday");break;
		}

	}
}
