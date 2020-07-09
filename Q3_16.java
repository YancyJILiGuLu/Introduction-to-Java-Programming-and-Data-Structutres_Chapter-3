package chapter3;

public class Q3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// support there are four points a(-50,100).b(50,100),c(-50,-100),d(50,-100) for this rectangle.

		String a="(-50,100)";
		String b="(50,100)";	
		String c="(-50,-100)";	
		String d="(50,-100)";	

		int x= (int) (1+(Math.random()*((4-1)+1)));

		if (x==1) {
			System.out.print(a);
			}

		else if (x==2) {
			System.out.print(b);
		}
		else if (x==3) {
			System.out.print(c);
		}
		else  {
			System.out.print(d);
		}


				}

			}
