package SDET_InterviewQuestions_Set1;
/*Java Program to find odd or even number*/
import java.util.Scanner;

public class P1_oddOReven {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println("Number is the Even Number : " + number);
		} else {
			System.out.println("Number is the Even Number : " + number);
		}

		scanner.close();
	}

}
