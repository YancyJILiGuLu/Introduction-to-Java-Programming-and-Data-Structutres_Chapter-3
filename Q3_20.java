package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df=new DecimalFormat("0.00000");//control output format
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58F to 41F:");
		double tem = input.nextDouble();
		System.out.println("Enter the wind speed(>=2)in miles per hours:");
		double wind = input.nextDouble();
		double windChill = 35.74+0.6215*tem-35.75*Math.pow(wind, 0.16)+0.4275*tem*Math.pow(wind, 0.16);
		 if (tem<-58 || tem > 41 || wind <2 ) {
			 System.out.print("Invalid input");
		 }
		 else {
		System.out.println("the wind chill indx is:"+df.format(windChill));
	}
	}
}
