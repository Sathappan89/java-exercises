package javaexercisess_setOne;

import java.util.Scanner;

public class JavaProg3 {

	/*
	 * Write a Java Program that reads an integer between 0 and 1000 and adds all
	 * the digits in the integer. Test Data: Input an integer between 0 and 1000:
	 * 565 Expected Output: The Sum of all digits is 565 is 16
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input an integer between 0 and 1000: ");
		int num = sc.nextInt();

		int Quotient1 = num / 10; // 56
		int Remainder1 = num % 10; // 5

		int Quotient2 = Quotient1 / 10; // 5
		int Remainder2 = Quotient1 % 10; // 6

		// int Quotient3 = Quotient2/10; //0
		int Remainder3 = Quotient2 % 10; // 5

		int sum = Remainder1 + Remainder2 + Remainder3;

		System.out.println("The Sum of all digits is " + num + " is " + sum);

	}

}
