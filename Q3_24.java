package chapter3;

import java.util.Scanner;

public class Q3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		int x = (int) (1+(Math.random()*(13-1)+1));
		String x1="";
		switch(x) {
		case 1:x1= "1";break;
		case 2:x1="2";break;
		case 3:x1="3";break;
		case 4:x1="4";break;
		case 5:x1="5";break;
		case 6:x1="6";break;
		case 7:x1="7";break;
		case 8:x1="8";break;
		case 9:x1="9";break;
		case 10:x1="10";break;
		case 11:x1="Jack";break;
		case 12:x1="Queen";break;
		case 13:x1="King";break;

		}
		int y = (int) (1+(Math.random()*(4-1)+1));
		String y1="";
		switch (y) {
		case 1: y1="Clubs";break;
		case 2: y1="Diamond";break;
		case 3: y1="Hearts";break;
		case 4: y1="Spades";break;

		}	
		System.out.print("The card you picked is "+x1 +"of "+ y1);



	}

}
