package chapter3;

import java.util.Scanner;

public class Q3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter weight in pounds :");
		double pounds =  input.nextDouble();
		
		System.out.print("Enter height in feet(not include height in inch) :");
		double feet =  input.nextDouble();
		
		System.out.print("Enter height in  inch :");
		double inch =  input.nextDouble();
		
		final double KILOGRAMS_PER_POUND=0.45359273;
		final double METER_PER_INCH=0.0254;
		
		double weightInKilograms = pounds * KILOGRAMS_PER_POUND;
		double HeightInMeter = (feet*12 +inch)*METER_PER_INCH;
		 double BMI = weightInKilograms/Math.pow(HeightInMeter, 2);
		 
		 System.out.println("BMI is "+BMI);
		 if (BMI <18.5)
			 System.out.println("Underweight");
		 else if  (BMI <25)
			 System.out.println("Normal");
		 else if  (BMI <30)
			 System.out.println("Overweight");
		 else 
			 System.out.println("Obese");	
	}

}
