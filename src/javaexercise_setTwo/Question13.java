package javaexercise_setTwo;

public class Question13 {
	/*
	 * * 1 2 * * * 1 2 3 4
	 * 
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (j <= i) {
					if(i%2==0) {
						System.out.print(j+" ");
					}
					if(i%2==1) {
						System.out.print("*"+" ");
					}

				}
			}
			System.out.println(" ");
		}

	}

}
