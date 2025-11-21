package javaexercise_setThree;

public class FindtheFrequency {

	public static void main(String[] args) {

		int a[] = { 8, 2, 3, 6, 5, 1, 1 };
		boolean visited[] = new boolean[a.length];

		for (int i = 0; i < a.length; i++) {

			// Skip if already counted
			if (visited[i] == true) {
				continue;
			}

			int count = 1;

			// Compare with rest of elements
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					visited[j] = true; // mark as counted
				}
			}

			System.out.println(a[i] + " -> " + count);
		}

	}

}
