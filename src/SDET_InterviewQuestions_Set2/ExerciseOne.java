package SDET_InterviewQuestions_Set2;

import java.util.Arrays;

public class ExerciseOne {
	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 10;
		a[1] = 5;
		a[2] = 4;
		a[3] = 21;
		a[4] = 19;

		System.out.println(a); // [I@5e9f23b4

		System.out.println(Arrays.toString(a)); // [10, 5, 4, 21, 19]
		System.out.println(a.length); // 5

		int i = 0;
		int j = a.length - 1;

		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}

		// Print reversed array using index-based for loop
		System.out.println("Reversed array:");
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}

	}

}
