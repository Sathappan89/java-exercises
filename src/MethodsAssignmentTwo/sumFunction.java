package MethodsAssignmentTwo;

import StackMemory.a;

public class sumFunction {

	public static int sum(int[] a) {
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

		return sum / a.length;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 10, 10, 10, 10 };
		int result = sum(arr);
		System.out.println(result);

	}

}
