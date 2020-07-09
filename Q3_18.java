package chapter3;

import java.util.Scanner;

public class Q3_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your the weight of package :");

		int weight = (int) input.nextDouble();
		if (weight ==0) {
			System.out.print("invalid input");
		}
		else if (weight >0 && weight <=1) {
			System.out.print("You are going to pay $3.5");
			
		}
		else if (weight >1 && weight <=3) {
			System.out.print("You are going to pay $5.5");
			
		}
		else if (weight >3 && weight <=10) {
			System.out.print("You are going to pay $8.5");
			
		}
		else if (weight >10 && weight <=20) {
			System.out.print("You are going to pay $10.5");
			
		}
		else 
			System.out.print("over 20 pounds, the package cant be shiped");
	}

}
