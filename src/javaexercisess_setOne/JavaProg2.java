package javaexercisess_setOne;

import java.util.Scanner;

public class JavaProg2 {

	/*
	 * Write a Java Program that reads a number in inches, converts it to meters.
	 * 
	 * Note : One inch is 0.0254 meter
	 * 
	 * Test Data Input a value of inch: 1000
	 * 
	 * Expected Output: 1000.o inch in 25.4 meters
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input length in inches
		System.out.print("Enter lenght of the inches: ");
		double inches = sc.nextDouble();

		// Conversion formula
		double meters = inches * 0.0254;

		// Output result
		System.out.println(inches + " inch in " + meters + "meters");

		sc.close();
	}

}
