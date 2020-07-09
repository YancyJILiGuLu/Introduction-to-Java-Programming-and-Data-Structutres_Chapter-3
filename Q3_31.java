package chapter3;

import java.util.Scanner;

public class Q3_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the exchange rate from dollars to RMB:");
		double changeRate=input.nextDouble();
		
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
		double wants=input.nextDouble();
		
		System.out.printf("Enter the %f" +" amount:",wants);
		double amount=input.nextDouble();
		
		double afterChange=0;
		
		if (wants ==0 ) {
			afterChange= amount * changeRate;
			System.out.printf("%f "+"dollars is %f RMB", wants,afterChange);
			
		}
		else if (wants ==1 ) {
			afterChange= amount / changeRate;
			System.out.printf("%f "+"RMB is %f dollars", wants,afterChange);
			
		}
		else {
			System.out.print("Incorrect input");
		}

	}

}
