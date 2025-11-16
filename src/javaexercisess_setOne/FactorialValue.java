package javaexercisess_setOne;

public class FactorialValue {
	/*
	 * Write a program to find the factorial value of any number entered through the
	 * keyword
	 */
	/* N! = 1*2*3.....N */
	public static void main(String[] args) {

		int FactorialNumber = Integer.parseInt(args[0]);
		int num = 1;
		
		for (int i = 1; i <= FactorialNumber; i++) {
			num = i * num;

		}
		System.out.println(num);

	}

}
