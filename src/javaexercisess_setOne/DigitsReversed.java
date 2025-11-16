package javaexercisess_setOne;

public class DigitsReversed {
	/*
	 * Write a program that prompts the user to input an integer and then outputs
	 * the number with the digits reversed. For Example : if the input is 12345, the
	 * output should be 54321
	 */
	public static void main(String[] args) {
		
		int N = 12345;
		int rem = 0;
		
		while(N!=0){
			rem=N%10;
			System.out.print(rem);
			N=N/10;
		}

	}

}
