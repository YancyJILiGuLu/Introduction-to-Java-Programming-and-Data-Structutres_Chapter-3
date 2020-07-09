package chapter3;

import java.util.Scanner;

public class Q3_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMillisecond = System.currentTimeMillis();
		long totalSecond=totalMillisecond/1000;
		long currentSecond=totalSecond%60;
		long totalMinutes=totalSecond/60;
		long currentMinutes=totalMinutes%60;
		long totalHours=totalMinutes/60;
		long currentlHours=totalHours%24;
	
		String s="";
		Scanner	input = new Scanner(System.in);
		System.out.println("Enter the time zoon offset to GMT");

		int offset = input.nextInt();
		if (currentlHours>12 && currentlHours <= 24) {
			currentlHours = currentlHours-12;
			s="pm";
		}
			else {
				s="am";
			}
		System.out.println("Current Greenwich Mean time is "+currentlHours +":"+currentMinutes+":"+currentSecond+s);
		System.out.println("The current time is "+(currentlHours+offset)+":"+currentMinutes+":"+currentSecond+s);

		

	}
	}


