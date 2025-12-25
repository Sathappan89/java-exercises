package SDET_InterviewQuestions_Set1;
/*Java Program to find Fibonacci Series upto a given number range*/

import java.util.Scanner;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

public class P3_FibonacciSeries {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int number = scanner.nextInt();

		int first = 0;
		int second = 1;

		for (int i = 0; i < number; i++) {
			System.out.print(first + " ");

			int temp = first + second;
			first = second;
			second = temp;

		}
		System.out.println(first);
		System.out.println(second);
		scanner.close();
	}

}
