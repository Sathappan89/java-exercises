package SDET_InterviewQuestions_Set2;

public class P7a_SecondLargestNumberDuplicateNumber {

	public static void main(String[] args) {
		int arr[] = { 7, 5, 3, 7, 1 };
		int largest = Integer.MIN_VALUE;
		System.out.println(largest);
		int len = arr.length;
		System.out.println("Length of the array : " + len);

		int largestPos = -1;

		for (int i = 0; i < len; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
				largestPos = i;
			}
		}
		System.out.println("********************************");
		System.out.println("First Largest Element : " + largest);
		System.out.println("First Largest Element index : " + largestPos);

		int secondLargest = Integer.MIN_VALUE;
		int secondLargestPos = -1;
		for (int i = 0; i < len; i++) {
			if (arr[i] > secondLargest && largestPos != i) {
				secondLargest = arr[i];
				secondLargestPos = i;
			}
		}
		System.out.println("Second Largest Element : " + secondLargest);
		System.out.println("Second Largest Element index : " + secondLargestPos);

	}

}
