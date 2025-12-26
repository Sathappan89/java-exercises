package SDET_InterviewQuestions_Set1;

/* Write a program to find the factorial value of any number entered through the keyboard
 * N! = 1*2*3*...N
 * */
import java.util.Scanner;

public class P15_FactorialValue {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int fact = 1;
		for (int i = number; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}