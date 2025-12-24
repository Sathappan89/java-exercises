package JavaArrays;

//Find First Largest Array Element
public class FindFirstLargestArrayElement {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 90 };

		int len = a.length;
		System.out.println(len);

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < len ; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println(max);
	}

}
