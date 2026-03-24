package StringAssignments;

public class ReverseWord {

	public static String reverseEachWord(String str) {

		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("Input string cannot be null or empty");
		}

		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			StringBuilder rev = new StringBuilder();

				for (int j = word.length() - 1; j >= 0; j--) {
					rev.append(word.charAt(j));
				}

			result.append(rev);

				if (i < words.length - 1) {
					result.append(" ");
				}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(reverseEachWord(str));
	}

}