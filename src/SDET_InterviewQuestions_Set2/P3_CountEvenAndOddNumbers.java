package SDET_InterviewQuestions_Set2;

import java.util.Arrays;
import java.util.Scanner;

public class P3_CountEvenAndOddNumbers {
//Count how many even and odd numbers are in a static array.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + " numbers:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int len = arr.length;
		System.out.println("Length of the array : " + len);

		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < len; i++) {

			if (arr[i] % 2 == 0) {
				evenCount++;
			}
			if (arr[i] % 2 == 1) {
				oddCount++;
			}
		}

		System.out.println("Count of the Even Number " + evenCount);
		System.out.println("Count of the Odd Number " + oddCount);

		System.out.println(" ");
		System.out.println("Print the Even and Odd Numbers : ");

		int evenNumber[] = new int[evenCount];
		int oddNumber[] = new int[oddCount];
		int j=0;
		for (int i = 0; i < len; i++) {
			if (arr[i] % 2 == 0) {
				evenNumber[j] = arr[i];
				j++;
			}
		}

		int k=0;
		for (int i = 0; i < len; i++) {
			if (arr[i] % 2 == 1) {
				oddNumber[k] = arr[i];
				k++;
			}
		}

		System.out.print(Arrays.toString(evenNumber));
		System.out.println(" ");
		System.out.println(Arrays.toString(oddNumber));
		sc.close();
	}
}