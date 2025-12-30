package SDET_InterviewQuestions_Set2;

public class P6_AscendingOrder {

	public static void main(String[] args) {

		int arr[] = { 5, 7, 1, 3, 6, 8, 2, 9, 4 };
		int len = arr.length;
		System.out.println("Enter the length of the array : " + len);

		System.out.println("Original Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Bubble Sort using index-based loops
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					// swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("\n\nSorted Array (Ascending):");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}