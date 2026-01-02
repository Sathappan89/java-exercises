package SDET_InterviewQuestions_Set2;

public class P6a_DescendingOrder {

	public static void main(String[] args) {
		
		int arr[] = { 6, 3, 4, 9 };
		int len = arr.length;
		System.out.println("Enter the length of the array : " + len); // 4

		System.out.println("Original Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for (int j = len - 1; j >= 0; j--) {
			for (int i = 0; i < j; i++) {
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		
		
		System.out.println(" ");
		System.out.println("Ascending Array:" + " ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
