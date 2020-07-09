package chapter3;

import java.util.Scanner;

public class Q3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		

		int number1 =(int) (0+( Math.random())*((100-0)+1));
		int number2= (int) (0+( Math.random())*((100-0)+1));
		
		System.out.print("Enter the sum of number1: "+ number1+"number2: "+number2);
		int answer = input.nextInt();
		
		if(answer == number1 + number2) {
			System.out.println("You are correct");
		}
		else 
			System.out.println("Your answer si wrong\n "
		+ number1 +"number1"+ number2 +"number2"+"should be"+(number1+number2));
		
		
		

	}

}
