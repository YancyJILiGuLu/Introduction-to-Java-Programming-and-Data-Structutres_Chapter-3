package chapter3;

import java.util.Scanner;

public class Q3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a number with three digits:");
		int number = input.nextInt();
		
		int remainding = number;
		int digit1 = remainding/100;
		remainding=remainding%100;
		int digit2 = remainding/10;
		remainding =remainding%10;
		int digit3 = remainding;
		
		
		if (digit1 == digit3 ) {
			System.out.printf(" %d "+"is a palindrome", number);
		}
			else 
				System.out.printf(" %d "+"is not a palindrome",number);
		
		
	}

}
