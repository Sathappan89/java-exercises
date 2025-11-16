package javaexercisess_setOne;

public class FibonacciSeries {
	/*
	 * Write a program to print Fibonacci Series of n terms where n is input by
	 * user: 0 1 1 2 3 5 8 13 21 34 55 ...
	 */
	public static void main(String[] args) {

		int n = 10;
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;

		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int i = 2; i < n; i++) {
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
		}

	}

}