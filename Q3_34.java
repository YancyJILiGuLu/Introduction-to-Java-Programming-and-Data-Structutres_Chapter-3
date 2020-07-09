package chapter3;

import java.util.Scanner;

public class Q3_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter three points for p0,p1,and p2:");
		double x0=input.nextDouble();
		double y0=input.nextDouble();
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		
		double judgement= (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
		double distance =Math.pow((Math.pow((x1-x0), 2)+(Math.pow((y1-y0), 2))), 0.5);
		
		
		if (judgement ==0  ) {
			System.out.print("("+x2+","+y2+")is on the  line segement "
					+ "from ("+x0+","+y0+")"+" to ("+x1+","+y1+")");
		}
		else {
			System.out.print("("+x2+","+y2+")is not on the  line segement "
					+ "from ("+x0+","+y0+")"+" to ("+x1+","+y1+")");
		}

	}

	}


