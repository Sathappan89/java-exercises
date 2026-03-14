package MethodAssignments;

public class CalculatorProgram {

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public int subtraction(int a, int b) {
		int c = a - b;
		return c;
	}

	public int multiplication(int a, int b) {
		int c = a * b;
		return c;
	}

	public int division(int a, int b) {
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {
		CalculatorProgram c1 = new CalculatorProgram();
		int d = c1.sum(10, 20);
		System.out.println(d);

		int e = c1.subtraction(20, 10);
		System.out.println(e);

		int d1 = c1.multiplication(10, 20);
		System.out.println(d1);

		int k1 = c1.division(10, 2);
		System.out.println(k1);

	}

}
