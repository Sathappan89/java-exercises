package SDET_InterviewQuestions_Set2;

import java.util.Arrays;

public class ExerciseTwo {

	public static void main(String[] args) {

		int a[] = { 10, 4, 5, 7, 14, 5 };

		int li = a[0];
		int hi = a[a.length - 1];
		int len = a.length;

		System.out.println(li); // 10
		System.out.println(hi); // 5
		System.out.println(len); // 6

		int b[] = new int[len];

		for (int i = 0; i < len; i++) {
			for (int j = len - 1; j >= 0; j--) {
				if (i + j == len - 1) {
					b[j] = a[i];
				}
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
