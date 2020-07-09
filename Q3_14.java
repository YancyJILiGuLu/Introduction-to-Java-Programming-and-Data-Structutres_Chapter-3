package chapter3;

import java.util.Scanner;

public class Q3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter you guess\n"
				+"(0 for Monticello (Jefferson's colonial plantation) on the back,"
				+ "\n1 for Thomas Jefferson on the front ):");

		int guess = input.nextInt();
		
		int output=(int) (0+Math.random()*((1-0)+1));
		
		
		 if (guess==output) {
			 System.out.print("Congradualations!! You guess it correctly" );
		 }
			 else 
				 System.out.print("Sorry you missed it");
		 }

	}


