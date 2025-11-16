package javaexercise_setTwo;

public class Question14 {
	/*
	 * *
	 * 
	 * @ @ * * *
	 * 
	 * @ @ @ @
	 * 
	 */
	public static void main(String[] args) {
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= 4; j++) {
				if (i > j) {
					System.out.print("  ");
				}
				if (i <= j) {
					if (i  == 4) {
						System.out.print("*" + " ");
					}
					if (i  == 2) {
						System.out.print("3" + " ");
					}
					if (i % 2 == 1) {
						System.out.print("@" + " ");
					}

				}
			}
			System.out.println(" ");
		}

	}

}
