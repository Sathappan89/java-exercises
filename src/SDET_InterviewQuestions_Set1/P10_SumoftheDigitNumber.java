package SDET_InterviewQuestions_Set1;

import java.util.Scanner;

public class P10_SumoftheDigitNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = scanner.nextInt();

		int sum = 0;

		while (number > 0) {
			int q = number % 10;
			sum = sum + q;
			number = number / 10;
		}

		System.out.println(sum);
		scanner.close();
	}

}
