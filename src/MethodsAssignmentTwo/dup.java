package MethodsAssignmentTwo;

import java.util.Arrays;

public class dup {

	public static void main(String[] args) {
		int a[] = { 10, 2, 3, 4, 2, 9, 10 };
		int len = a.length;
		int duplicateCount = 0;
		for (int j = 0; j < len; j++) {
			for (int i = j + 1; i < len; i++) {
				if (a[j] == a[i]) {
					duplicateCount++;
				}
			}
		}
		System.out.println(duplicateCount);

		int result[] = new int[len - duplicateCount];
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