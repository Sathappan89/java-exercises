package SDET_InterviewQuestions_Set1;

import java.util.Scanner;

public class P8_findNumberofdigits {
/*Java Program to find number of digits in given number*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int number = scanner.nextInt();
		
		int count = 0;
		
		while(number>0) {
			int rem = number%10;
			count++;
			number = number/10;
			
		}
		
		System.out.println("Number of digits in the given number : " + count);

	}

}
