package SDET_InterviewQuestions_Set1;

import java.util.Scanner;

public class P9_NumberPalindrome {
	/* Java Program to find Palindrome number */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int number = scanner.nextInt();
		int originalNumber = number;

		boolean isPalindrome = true;

		int rev =0;

		while (number > 0) {
			int rem = number % 10;
			rev = rev*10+rem;
			number = number / 10;
		}
		
		System.out.println(rev);

		if (originalNumber == rev) {
			System.out.println("number is palindrome : " + originalNumber);
		} else {
			System.out.println("number is not palindrome : " + originalNumber);
		}

	}

}
