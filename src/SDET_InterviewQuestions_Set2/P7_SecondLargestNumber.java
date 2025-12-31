package SDET_InterviewQuestions_Set2;

public class P7_SecondLargestNumber {
//Find the second largest number in a static array.
	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 7, 1 };
		int largest = Integer.MIN_VALUE;
		System.out.println(largest);
		int len = arr.length;
		System.out.println("Length of the array : " + len);

		for (int i = 0; i < len; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("First Largest Array : " + largest);

		int secondLargest = Integer.MIN_VALUE;
		for (int j = 0; j < len; j++) {
			if (arr[j] > secondLargest && largest != arr[j]) {
				secondLargest = arr[j];
			}

		}
		System.out.println("Second Largest Array : " + secondLargest);
	}
}