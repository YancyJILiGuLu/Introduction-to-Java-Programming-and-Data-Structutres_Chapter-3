package chapter3;

import java.util.Scanner;

public class Q3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter three sides for a triangle:");

		double  a= input.nextDouble();
		double  b= input.nextDouble();
		double  c= input.nextDouble();
		
		
		if (a+b<=c || b+c<=a || c+a<= b) {
			System.out.print("Invalid input ");
		}
		else 
			System.out.printf("The perimeter of this triangle is :%f",(a+b+c));

	}

}
