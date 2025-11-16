package javaexercisess_setOne;

public class PowerOfAnother {
	/*
	 * Two numbers are entered through the keyboard. Write a program to find the
	 * value of one number raised to the power of another
	 * 
	 * Example : Program takes '2' and '5' as input. The output should be 2^5
	 */
	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		int m = 1;
		for (int i = 1; i <= b; i++) {
			m = a * m;
		}
		System.out.println(m);

	}

}