package javaexercisess_setOne;

import java.util.Scanner;

public class JavaProg4 {
	/*
	 * Write a Java Program to convert minutes into a number of years and days.
	 * 
	 * Test Data Input the number of minutes: 3456789 Expected Output: 3456789
	 * minutes is approximately 6 years and 210 days
	 * 
	 */

	/*
	 * Formula :
	 * 
	 * Years = minutes/525600
	 * 
	 * days = remaining minutes/1440
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input the number of minutes : ");
		int minutes = sc.nextInt();

		int year = minutes / 525600; // Remainder = 6

		int Remainingminutes = minutes % 525600; //

		int days = Remainingminutes / 1440; // Reminder = 210

		System.out.println(minutes + " minutes is approximately " + year + " years and " + days + " days ");
		sc.close();

	}

}