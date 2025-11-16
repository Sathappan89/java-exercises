package javaexercisess_setOne;

public class MultuplicationTable {

	/*
	 * Write a program that takes a positive integer as input. It should then print
	 * the multiplication table of that number
	 */
	// Sample Input : 5
	// Sample Output : 5, 10, 15, 20, 25 ....50
	public static void main(String[] args) {
		int m = 5;
		for (int i = 1; i <= 10; i++) {

			int multiplication = m * i;
			System.out.println(m + " * " + i + " = " + multiplication);
		}

	}

}
