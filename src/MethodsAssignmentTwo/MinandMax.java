package MethodsAssignmentTwo;

public class MinandMax {

	public static void MinMax(int a[]) {

		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);

	}

	public static void main(String[] args) {
		int arr[] = { 4, 5, 12, 5, 6 };
		MinandMax.MinMax(arr);

	}

}
