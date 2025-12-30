package SDET_InterviewQuestions_Set2;

import java.util.Scanner;

public class P2_ReverseArrayWithoutSecondarray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter " + size + " numbers:");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Reverse logic without second array
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}

		// Print reversed array using index-based for loop
		System.out.println("Reversed array:");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

		sc.close();
	}
}