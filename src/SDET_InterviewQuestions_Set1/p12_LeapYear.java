package SDET_InterviewQuestions_Set1;

import java.util.Scanner;
/*
 * Rule 1: It is divisible by 4
 * AND
 * Rule 2: It is NOT divisible by 100
 * UNLESS
 * Rule 3: It IS divisible by 400
 * */

public class p12_LeapYear {
//Leap
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int Year = scanner.nextInt();

		if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) {
			System.out.println(Year + " is a leap year");
		} else {
			System.out.println(Year + " is NOT a leap year");
		}
		scanner.close();
	}

}
