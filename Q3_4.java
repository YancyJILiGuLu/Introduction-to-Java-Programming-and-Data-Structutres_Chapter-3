package chapter3;

public class Q3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=12;// using for define range
		int min =1;
		int number= min+(int)(Math.random()*((max-min)+1));
		
		switch(number) {
		case 1:System.out.print("January"); break;
		case 2:System.out.print("February");break;
		case 3:System.out.print("March");break;
		case 4:System.out.print("April");break;
		case 5:System.out.print("May");break;
		case 6:System.out.print("June");break;
		case 7:System.out.print("July");break;
		case 8:System.out.print("Augusy");break;
		case 9:System.out.print("September");break;
		case 10:System.out.print("October");break;
		case 11:System.out.print("November");break;
		case 12:System.out.print("Decamber");break;
		}

	}

}
