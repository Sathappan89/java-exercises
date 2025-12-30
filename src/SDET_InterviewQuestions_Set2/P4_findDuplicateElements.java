package SDET_InterviewQuestions_Set2;

import java.util.Arrays;
import java.util.Scanner;

/*Find duplicate elements in a static array.*/
public class P4_findDuplicateElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter " + size + " arr :");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));

		int len = arr.length;
		System.out.println("Lenght of the array : " + len);

		System.out.println(" ");

		int duplicateElement = arr[0];
		int count = 0;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					count++;
				}

			}
		}

		System.out.println("Number of duplicate element : " + count);

		sc.close();
	}

}
