package chapter3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Q3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat (".0");
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a,b,c,d,e,f");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c= input.nextDouble();
		double d= input.nextDouble();
		double e= input.nextDouble();
		double f= input.nextDouble();
		
		double base=a*d-b*c;
		double x=(e*d-b*f)/base;
		double y=(a*f-e*c)/base;;
		
		if (base!=0) {
			System.out.print("The equation has two roots:"+df.format(x) +" and " +df.format(y));
		}
		
		else 
			System.out.print("The equation has no roots");
		

	}

}
