package javaexercise_setThree;

public class ReverseAString {

	public static void main(String[] args) {
		String str[] = {"t", "e", "s", "t"};
		int left = 0;
		int right = str.length - 1;

		while (left < right) {
		    String temp = str[left];
		    str[left] = str[right];
		    str[right] = temp;
		    left++;
		    right--;
		}

		// Printing the reversed array
		for (int i = 0; i < str.length; i++) {
		    System.out.print(str[i] + " ");
		}

	}

}
