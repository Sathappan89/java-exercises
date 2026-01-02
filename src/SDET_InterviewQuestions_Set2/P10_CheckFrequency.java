package SDET_InterviewQuestions_Set2;

public class P10_CheckFrequency {
//Count the frequency of each element in a static array.
	public static void main(String[] args) {

		int[] arr = { 4, 5, 4, 7, 5, 9, 4 };
		int n = arr.length;

		boolean[] visited = new boolean[n]; // default false

		for (int i = 0; i < n; i++) {

			if (visited[i] == true) {
				continue; // skip already counted elements
			}

			int count = 1; // current element appears at least once

			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true; // mark duplicate as visited
				}
			}

			System.out.println(arr[i] + " → " + count + " time(s)");
		}

	}

}