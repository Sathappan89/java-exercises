package javaexercise_setThree;

public class ReverseAChar {

	public static void main(String[] args) {
		char[] a = { 't', 'e', 's', 't', 'c' };

		int left = 0;
		int right = a.length - 1;

		System.out.println(left);
		System.out.println(right);

		while (left < right) {
			char temp = a[left];
			a[left] = a[right];
			a[right] = temp;

			left++;
			right--;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
