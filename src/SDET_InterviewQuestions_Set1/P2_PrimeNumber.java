package SDET_InterviewQuestions_Set1;

import java.util.Scanner;

/*Java Program to find Prime Number*/
/*a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11).*/
public class P2_PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int number = scanner.nextInt();

		boolean isPrime = true;

		if (number <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}

		}

		if (isPrime) {
			System.out.println("Number is a prime number = " + number);
		} else {
			System.out.println("Number is not a prime number = " + number);
		}

		scanner.close();
	}
}