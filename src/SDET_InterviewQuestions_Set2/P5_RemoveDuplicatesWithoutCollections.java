package SDET_InterviewQuestions_Set2;

import java.util.Arrays;
import java.util.Scanner;

public class P5_RemoveDuplicatesWithoutCollections {
//Remove duplicates from a static array without using collections.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter " + size + " array : ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(" Original Array ");
		System.out.println(Arrays.toString(arr));
		System.out.println(" ");

		int len = arr.length;
		System.out.println("Lenght of the array : " + len);

		System.out.println(" ");

		int duplicateCount = 0;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					duplicateCount++;
				}
			}
		}
		System.out.println("Number of duplicate element : " + duplicateCount);

		int result[] = new int[len - duplicateCount];
		int k = 0;

		for (int i = 0; i < len; i++) {
			boolean duplicate = false;
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
			if (duplicate!=true) {
				result[k] = arr[i];
				k++;
			}
		}

		System.out.println("Array after removing duplicates: " + Arrays.toString(result));
		sc.close();

	}

}
