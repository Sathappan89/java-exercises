package SDET_InterviewQuestions_Set1;

import java.util.Scanner;

/*Java Program to find Armstrong Number*/
//153 

public class P7_ArmstrongNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = scanner.nextInt();

		int original = number; /// store original number

		int q;
		int result = 0; // // sum of cubes

		while (number > 0) {
			q = number % 10; // extract last digit
			result = result + (q * q * q); // cube and add
			number = number / 10; // remove last digit
		}

		if (result == original) {
			System.out.println(original + " is an Armstrong number");
		} else {
			System.out.println(original + " is NOT an Armstrong number");
		}
	}
}