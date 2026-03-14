package MethodsAssignmentTwo;

public class p7 {

	public static void printArrayWithFactor(int factor, int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println((factor * array[i]) + " ");
		}

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		p7.printArrayWithFactor(2, a);

	}

}
