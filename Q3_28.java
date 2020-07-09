package chapter3;

import java.util.Scanner;

public class Q3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter R1's center x-,y-coordinates,width, and heigh:");
		double x1=input.nextDouble();	
		double y1=input.nextDouble();
		double width1=input.nextDouble();
		double heigth1=input.nextDouble();
		
		System.out.println("Enter R2's center x-,y-coordinates,width, and heigh:");
		double x2=input.nextDouble();		
		double y2=input.nextDouble();
		double width2=input.nextDouble();
		double heigth2=input.nextDouble();
		
		double yy=y1-y2;
		double xx=x1-x2;
		
		
		
		if (yy<=(Math.abs(1/2*(heigth1-heigth2)))&& xx <=(Math.abs(1/2*(width1-width2)))){
			System.out.print("Rectangle2 is inside Rectangle1");
		}
		else if (yy>(Math.abs(1/2*(heigth1-heigth2)))&& xx >(Math.abs(1/2*(width1-width2)))){
			System.out.print("Rectangle2 is inside Rectangle1");
		}
		else  {
			System.out.print("Rectangle2 is overlaps Rectangle1");
		}

	}

}
