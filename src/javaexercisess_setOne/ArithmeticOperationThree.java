package javaexercisess_setOne;

public class ArithmeticOperationThree {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int c = 5;

		int d = a + b / c * a;

		/*
		 * 1. Division first: b / c = 5 / 5 = 1 2. Multiplication next: 1 * a = 1 * 10 =
		 * 10 3. Addition last: a + 10 = 10 + 10 = 20
		 */

		System.out.println(d);

	}

}