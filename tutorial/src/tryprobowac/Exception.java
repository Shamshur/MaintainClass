package tryprobowac;

public class Exception {
	public static void main(String[] args) {
		int d,a;
		try {
			d=0;
			a=42/d;
			System.out.println("This wont print");
		}catch (ArithmeticException e) {
			System.out.println("Division by zero");
		}
		System.out.println("After catch statement");
	}
	
}

