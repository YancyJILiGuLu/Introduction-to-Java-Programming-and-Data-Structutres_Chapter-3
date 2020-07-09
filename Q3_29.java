package chapter3;

import java.util.Scanner;

public class Q3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Circle1's center x-,y-coordinates, and its radius:");
		double x1=input.nextDouble();	
		double y1=input.nextDouble();
		double radius1=input.nextDouble();
		
		System.out.println("Enter Circle2's center x-,y-coordinates, and its radius:");
		double x2=input.nextDouble();	
		double y2=input.nextDouble();
		double radius2=input.nextDouble();
		
		double d=Math.pow((Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)),0.5);
		if (d<=(Math.abs(radius2-radius1))) {
			System.out.print("Circle 2 is inside Circle1");
		}
		else if (d<(radius1+radius2)) {
			System.out.print("Circle 2 overlaps Circle1");
		}
		else 
			System.out.print("Circle 2 does not overlaps Circle1");
		
	}

}
