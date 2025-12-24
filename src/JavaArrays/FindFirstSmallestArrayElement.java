package JavaArrays;

public class FindFirstSmallestArrayElement {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 2, 5, 50, 60, 70, 90, 100 };

		int len = a.length;
		System.out.println(len);

		int min = a[0];

		for (int i = 0; i < len; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println(min);

	}

}
