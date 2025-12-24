package JavaArrays;

/* Find second largest array element
 * Write a Java program to find the second largest element in an array.
 * */
public class FindSecondLargestArrayElement {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70, 90 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		System.out.println(largest);  //-2147483648
		System.out.println(secondLargest); //-2147483648

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} 
			else if (a[i] > secondLargest && a[i] != largest) {
				secondLargest = a[i];
			}
		}

		System.out.println("Second largest element: " + secondLargest);

	}

}
