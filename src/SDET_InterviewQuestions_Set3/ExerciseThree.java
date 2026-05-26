package SDET_InterviewQuestions_Set3;

public class ExerciseThree {

	public static void main(String[] args) {
		String str = "love learning Java";
		char[] strArr = str.toCharArray();
		int n = strArr.length;
		int left = 0;
		int right = 0;
		for (int i = 0; i < n; i++) {
			if (strArr[i] == ' ' || i == n - 1) {
				if (strArr[i] == ' ') {
					right = i - 1;
				} else {
					right = i;
				}

				while (left < right) {
					char temp = strArr[left];
					strArr[left] = strArr[right];
					strArr[right] = temp;
					left++;
					right--;
				}
				left = i + 1;
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(strArr);
		System.out.println(sb.toString());
	}
}
