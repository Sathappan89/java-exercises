package javaexercisess_setOne;

public class PrimeNumber {
	/*
	 * Write a program that prompts the user to input a positive integer. It should
	 * then output a message indicating whether the number is a prime number
	 */
	// A number is a prime number if it is divisible only by 1 and itself
	// Example : 1,5,7,11,13,17,19,23,29,31,37,41,43,47,53

	public static void main(String[] args) {

		int N = 7;
		boolean flagIsPrime = true;

		for (int i = 2; i <= N - 1; i++) {
			if (N % i == 0) {
				flagIsPrime = false;
				break;
			}
		}

		if (flagIsPrime) {
			System.out.println(N + " is prime number");
		} else {
			System.out.println(N + " is Not prime number");
		}

	}

}
