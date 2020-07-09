package chapter3;

import java.util.Scanner;

public class Q3_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an integer:");
		double number=input.nextInt();
		
	boolean bothDiv =(number%5==0 && number%6==0) ;
	boolean onlyOne=(number%5==0 || number%6==0);
	boolean neithOne=(number%5==0 ^ number%6==0);
	
	
			System.out.println("Is "+number+" divisible by 5 and 6? "+bothDiv);

		
			System.out.println("Is "+number+" divisible by 5 or 6? "+ onlyOne);
		
			System.out.print("Is "+number+" divisible by 5 and 6? but not both"+neithOne);
		
	}

}
