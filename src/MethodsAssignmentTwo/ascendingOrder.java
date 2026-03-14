package MethodsAssignmentTwo;

import java.util.Arrays;

public class ascendingOrder {

	public static void ascendingtest(int a[]) {

		for (int i = a.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}

		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 5, 2 };
		ascendingOrder.ascendingtest(arr);

	}
}