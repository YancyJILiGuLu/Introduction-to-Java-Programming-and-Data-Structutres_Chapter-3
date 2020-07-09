package chapter3;

import java.util.Scanner;

public class Q3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int lotteryDigit1=(int)(Math.random()*10);
		
		int lotteryDigit2=(int)(Math.random()*10);
		
		int lotteryDigit3=(int)(Math.random()*10);
		
		int lottery =lotteryDigit1*100+lotteryDigit2*10+lotteryDigit3;
		

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick(three  digits):");

		int guess = input.nextInt();
		int remainding = guess;
		int guessDigit1=remainding/100;
		remainding=remainding%100;
		int guessDigit2=remainding/10;
		remainding=remainding%10;
		int guessDigit3=remainding;
		
		System.out.printf("the lottery is : %d",lottery);

		if (guess==lottery) {
		System.out.println("Exact match!: you win $10 000");
		}
		else if (guessDigit1 == lotteryDigit1 && guessDigit2 ==lotteryDigit3 && guessDigit3 ==lotteryDigit2) {
			System.out.println("Digit matched!: you win $3 000");
		}
		else if (guessDigit1 == lotteryDigit2 && guessDigit2 ==lotteryDigit3 && guessDigit3 ==lotteryDigit1){
			System.out.println("Digit matched!: you win $3 000");
			
		}
		else if (guessDigit1 == lotteryDigit2 && guessDigit2 ==lotteryDigit1 && guessDigit3 ==lotteryDigit3){
			System.out.println("Digit matched!: you win $3 000");
			
		}
		else if (guessDigit1 == lotteryDigit3 && guessDigit2 ==lotteryDigit2 && guessDigit3 ==lotteryDigit1){
			System.out.println("Digit matched!: you win $3 000");
			
		}
		else if (guessDigit1 == lotteryDigit3 && guessDigit2 ==lotteryDigit1 && guessDigit3 ==lotteryDigit3){
			System.out.println("Digit matched!: you win $3 000");
			
		}
		else if (guessDigit1 == lotteryDigit1 ||guessDigit1 == lotteryDigit2 ||
				guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1 || 
				guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 ||
				guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 ||
				guessDigit3 == lotteryDigit3 )
			System.out.println("Match one digit,ypu win $1 000");
		else 
			System.out.println("Sorry, no match");
		



	}

}
