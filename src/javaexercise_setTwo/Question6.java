package javaexercise_setTwo;

public class Question6 {
	/*
	 * 00 01 02 03 11 12 13 22 23 33
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print(i + "" + j + " ");
				} else if (i <= j ) {
					System.out.print(i + "" + j + " ");
				}
			}
			System.out.println(" ");
		}

	}
}