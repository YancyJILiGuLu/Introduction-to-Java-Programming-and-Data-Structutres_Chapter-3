package chapter3;

import java.util.Scanner;

public class Q3_9 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		int number =  input.nextInt();

		int digit1=number/100000000;
		int remainderingNumber=number%100000000;
		
		int digit2=remainderingNumber/10000000;
		remainderingNumber=remainderingNumber%10000000;
		int digit3=remainderingNumber/1000000;
		remainderingNumber=remainderingNumber%1000000;
		int digit4=remainderingNumber/100000;
		remainderingNumber=remainderingNumber%100000;
		int digit5=remainderingNumber/10000;
		remainderingNumber=remainderingNumber%10000;
		int digit6=remainderingNumber/1000;
		remainderingNumber=remainderingNumber%1000;
		int digit7=remainderingNumber/100;
		remainderingNumber=remainderingNumber%100;
		int digit8=remainderingNumber/10;
		remainderingNumber=remainderingNumber%10;
		int digit9=remainderingNumber;
		
		
		int dogit10 =(digit1*1+digit2*2+digit3*3+digit4*4+digit5*5+digit6*6+digit7*7+digit8*8+digit9*9)%11;
		if (dogit10==10)
		System.out.printf("The ISBN-10 number is:%d%d%d%d%d%d%d%d%d%s",
				digit1,digit2,digit3,digit4,digit5,digit6,digit7,digit8,digit9,"x");
		else 
			System.out.printf("The ISBN-10 number is:%d%d%d%d%d%d%d%d%d%d",
					digit1,digit2,digit3,digit4,digit5,digit6,digit7,digit8,digit9,dogit10);
			
	}

}
