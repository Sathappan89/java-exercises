package SDET_InterviewQuestions_Set1;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int number = scanner.nextInt();

		if (number == 0) {
			System.out.println("Number is zero : " + number);
		} else if (number < 0) {
			System.out.println("Number is negative : " + number);
		} else {
			System.out.println("Number is positive : " + number);
		}

		scanner.close();

	}

}
