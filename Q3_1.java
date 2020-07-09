package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat (".00000");
		Scanner input = new Scanner (System.in);
		System.out.print("Enter three number respnse for a,b,c");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c= input.nextDouble();
		
		double x=((Math.pow(b,2))-4*a*c);
		double r1=(-b + Math.pow(x, 0.5))/2*a;
		double r2=(-b - Math.pow(x, 0.5))/2*a;
		if (x>0) {
			System.out.print("The equation has two roots:"+df.format(r1) +" and " +df.format(r2));
		}
		else if (x==0) {
			System.out.print("The equation has two roots:"+df.format(r1) );// r1 and r2 are the same resolut, 
		}
		else 
			System.out.print("The equation has no roots");
		
	}

}
