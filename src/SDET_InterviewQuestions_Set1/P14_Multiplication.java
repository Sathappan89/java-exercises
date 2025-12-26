package SDET_InterviewQuestions_Set1;

import java.util.Scanner;

public class P14_Multiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();

		int mul;

		for (int i = 1; i <= 10; i++) {
			mul = (number * i);
			System.out.println(number + " * " + i + " = " +  " "+mul);

		}

	}
}