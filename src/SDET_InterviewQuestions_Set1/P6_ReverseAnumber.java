package SDET_InterviewQuestions_Set1;

import java.util.Scanner;

public class P6_ReverseAnumber {
	/* Java Program to reverse number */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = scanner.nextInt();

//		int rev = number % 10;
//		System.out.println(rev); // Remainder
//
//		int q = number / 10;
//		System.out.println(q); // Quotient

		int reverseNumber = 0;

		while (number > 0) {
			reverseNumber = number % 10;

			System.out.print(reverseNumber + "");
			number = number / 10;
		}

	}

}
