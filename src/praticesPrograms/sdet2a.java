package praticesPrograms;

import java.util.Scanner;

public class sdet2a {
	/* Java Program to find Prime number */
//2,3,5,7,11,13,17,19,23,29,31,37,41,43
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = sc.nextInt();

		boolean isPrimeNumber = true;

		if (number <= 1) {
			isPrimeNumber = false;
		} else {

			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrimeNumber = false;
					break;
				}
			}

			if (isPrimeNumber) {
				System.out.println("Prime Number " + number);
			} else {
				System.out.println("Not a Prime Number " + number);
			}

		}
	}

}
