package W3StaticFunction;

import java.util.Arrays;

public class CharCount {

	// Function to count each character using index loops
	public static void countChars(String str) {

		char[] arr = str.toCharArray();

		System.out.println(Arrays.toString(arr)); // [P, l, a, y, w, r, i, g, h, t, , t, e, s, t]
		System.out.println(arr.length); // 15

		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {

			// Skip spaces and already-counted characters
			if (arr[i] == ' ' || visited[i]) {
				continue;
			}

			int count = 1;

			// Compare arr[i] with the rest of the characters
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}

			System.out.println(arr[i] + " = " + count);
		}
	}

	public static void main(String[] args) {
		String str = "Playwright test";
		countChars(str); // calling the function
	}

}
