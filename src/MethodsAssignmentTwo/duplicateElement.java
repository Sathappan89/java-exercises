package MethodsAssignmentTwo;

import java.util.Arrays;

public class duplicateElement {

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 1, 4, 5, 3 };
		int len = a.length;
		System.out.println(len);
		int count = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
		}
		System.out.println(count);

		int result[] = new int[len - count];
		int k = 0;

		for (int i = 0; i < len; i++) {
			boolean duplicate = false;
			for (int j = i + 1; j < len; j++) {
				if (a[i] == a[j]) {
					duplicate = true;
					break;
				}
			}
			if (duplicate != true) {
				result[k] = a[i];
				k++;
			}
		}

		System.out.println("Array after removing duplicates: " + Arrays.toString(result));

	}

}
