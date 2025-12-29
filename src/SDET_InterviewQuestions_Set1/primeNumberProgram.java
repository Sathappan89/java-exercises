package SDET_InterviewQuestions_Set1;

public class primeNumberProgram {

	public static void main(String[] args) {

		int number = 11;

		boolean isPrime = true;

		if (number <= 0) {
			isPrime = false;
		} else {
			for (int i = 2; i <= number; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
			}
		}

		if (isPrime) {
			System.out.println("number is prime : " + number);
		} else {
			System.out.println("number is not a prime : " + number);
		}

	}

}
