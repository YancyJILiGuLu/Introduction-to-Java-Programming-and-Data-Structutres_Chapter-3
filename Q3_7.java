package chapter3;

import java.util.Scanner;

public class Q3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter amount in double  :");
		double amount =  input.nextDouble();
		int remainingAmount = (int)(amount *100);

		int numberOfDollars=remainingAmount /100;
		remainingAmount=remainingAmount%100;

		int numberOfQuarters=remainingAmount /25;
		remainingAmount=remainingAmount%25;

		int numberOfDimes=remainingAmount /10;
		remainingAmount=remainingAmount%10;

		int numberOfNickles=remainingAmount /5;
		remainingAmount=remainingAmount%5;

		int numberOfPennies=remainingAmount ;

		System.out.println("The amount you entered " + amount + " consists of :");

		if (numberOfDollars != 0 ) {
			if (numberOfDollars ==1) {
				System.out.println("1 Dollar");
			}
			else 
				System.out.println( numberOfDollars+" Dollars");

		}

		if (numberOfQuarters != 0 ) {
			if (numberOfQuarters ==1) {
				System.out.println("1 Quarter");
			}
			else 
				System.out.println(numberOfQuarters+" Quarters");

		}
		if (numberOfDimes != 0 ) {
			if (numberOfDimes ==1) {
				System.out.println("1 Dime");
			}
			else 
				System.out.println(numberOfDimes+" Dimes");

		}
		if (numberOfNickles != 0 ) {
			if (numberOfNickles ==1) {
				System.out.println("1 Nickle");
			}
			else 
				System.out.println(numberOfNickles+" Nickles");

		}
		if (numberOfPennies != 0 ) {
			if (numberOfPennies ==1) {
				System.out.println("1 Pennie");
			}
			else 
				System.out.println(numberOfPennies+" Pennies");

		}


	}

}
