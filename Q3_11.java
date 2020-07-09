package chapter3;

import java.util.Scanner;

public class Q3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);

		System.out.print("Enter a year and a month:");
		int year = input.nextInt();
		int month=input.nextInt();

		boolean isLeapYear=
				(year %4 ==0 && year %100 !=0)||(year %400 ==0);

		switch(month) {
		case 1: System.out.printf("January %d "+"has 31 days",year );break;
		case 2: 

			if (isLeapYear ) {
				System.out.printf("February %d "+"has 29 days",year );
			}
			else {
				System.out.printf("February %d "+"has 28 days",year); 


			} break;
		case 3: System.out.printf("March %d "+"has 31 days" ,year);break;
		case 4: System.out.printf("Apirl %d "+"has 30 days",year );break;
		case 5: System.out.printf("May %d "+"has 31 days",year );break;
		case 6: System.out.printf("Juan %d "+"has 30 days",year );break;
		case 7: System.out.printf("July %d "+"has 31 days" ,year);break;
		case 8: System.out.printf("August %d "+"has 31 days" ,year);break;
		case 9: System.out.printf("September %d "+"has 30 days",year );break;
		case 10: System.out.printf("October %d "+"has 31 days" ,year);break;
		case 11: System.out.printf("November %d "+"has 30 days",year );break;
		case 12: System.out.printf("December %d "+"has 31 days" ,year);break;
			

		}
	}

}
