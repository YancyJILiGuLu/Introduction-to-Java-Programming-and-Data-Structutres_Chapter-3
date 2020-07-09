package chapter3;

import java.util.Scanner;

public class Q3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.print("Enter three number  :");

		int a = input.nextInt();
		int b= input.nextInt();
		int c = input.nextInt();

		if (a<b) {
			if(b<c){
				System.out.printf(" The number you entered ascending order by :%d %d %d\n",a,b,c );
			}
			else if (a<c) {
				System.out.printf("The number you entered ascending order by :%d %d %d\n", a,c,b);

			}
			else 
				System.out.printf("The number you entered ascending order by :%d %d %d\n", c,a,b);

		}


		if (c<b && b<a) {


			System.out.printf("The number you entered ascending order by :%d %d %d\n",c,b,a);

		}
		if (b<c) {
			if(c<a){
				System.out.printf(" The number you entered ascending order by :%d %d %d\n", b,c,a );
			}
			else if (b<a) {
				System.out.printf("The number you entered ascending order by : %d %d %d\n",b,a,c);



			}
		}
	}
}




