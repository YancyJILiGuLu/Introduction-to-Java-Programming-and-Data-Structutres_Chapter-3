import java.util.Scanner;

public class Q3_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter (x1,y1) and (x2,y2) for Line1");
		double x1= input.nextDouble();
		double y1= input.nextDouble();
		double x2= input.nextDouble();
		double y2= input.nextDouble();
		
		System.out.print("Enter (x3,y3) and (x4,y4)for point2");
		double x3= input.nextDouble();
		double y3= input.nextDouble();
		double x4= input.nextDouble();
		double y4= input.nextDouble();
		
		if((x2-x1)*(y4-y3)==(x4-x3)*(y2-y1)) {
			System.out.print("The two line are parallel");
		}
			else {
		double x=((x2*y1-x1*y2)*(x4-x3)-(x4*y3-x3*y4)*(x2-x1))
				/((x2-x1)*(y4-y3)-(x4-x3)*(y2-y1));
		double y=((x2*y1-x1*y2)*(y4-y3)+(x4*y3+x3*y4)*(y2-y1))
				/((x2-x1)*(y4-y3)-(x4-x3)*(y2-y1));
		System.out.printf("The intersecting points are: (%f,%f)",x,y);
		input.close();
		}
		

	}

}
