package javaexercisess_setOne;

import java.util.Scanner;

public class JavaProg1 {

	/*
	 * Write a Java Program to convert temperature from Fahrenheit to Celsius
	 * degree.
	 */
	/* Formula: (X F-32)*5/9 = Y*C */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input temperature in Fahrenheit
		System.out.print("Enter temperature in Fahrenheit: ");
		double fahrenheit = sc.nextDouble();

		// Conversion formula: (F - 32) * 5/9
		double celsius = (fahrenheit - 32) * 5 / 9;

		// Output result
		System.out.println(fahrenheit + "°F = " + celsius + "°C");

		sc.close();

	}

}
