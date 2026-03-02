package praticesPrograms;

import java.util.Scanner;

/*Java Program to find odd or even number*/
public class sdet1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("Number is even " + number);
		} else {
			System.out.println("Number is odd " + number);
		}

	}

}
