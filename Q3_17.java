package chapter3;

import java.util.Scanner;

public class Q3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computer=(int) (0+Math.random()*((2-0)+1));
		
		Scanner input = new Scanner (System.in);
		System.out.print("scissor(0),rock(1),paper(2):");

		int guess = input.nextInt();
		
		//if (input.nextLine().equals(" ")) System.exit(0);//close input
		
		if (computer ==1 && guess==1 ) {
			System.out.print("You are rock, "+"computer is rock, "+"it is a draw");
		}
		else if (computer ==2 && guess ==2) {
			System.out.print("You are paper, "+"computer is paper, "+"it is a draw");
		}
		else if (computer ==0 && guess ==0) {
			System.out.print("You are scissor, "+"computer is scissor, "+"it is a draw");
		}
		
		else if (computer ==2 && guess ==1) {
			System.out.print("You are rock, "+"computer is paper, "+"computer win");
		}
		else if (computer ==1 && guess ==0) {
			System.out.print("You are scissor, "+"computer is rock, "+"computer win");
		}
		else if (computer ==0 && guess ==2) {
			System.out.print("You are paper, "+"computer is scissor, "+"computer win");
		}
		else if (computer ==1 && guess ==2) {
			System.out.print("You are paper, "+"computer is rock, "+"you win");
		}
		else if (computer ==0 && guess ==1) {
			System.out.print("You are rock, "+"computer is scissor, "+"you win");
		}
		else if (computer ==2 && guess ==0) {
			System.out.print("You are scissor, "+"computer is paper, "+"you win");
		}
		else 
			System.out.print("Error, invalid enter");

	}

}
