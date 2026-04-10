package SDET_InterviewQuestions_Set3;

public class ExerciseFour {
//Reverse third word from a sentence
	public static String thirdWord(String str) {

		if (str == null) {
			throw new RuntimeException("Str is null");
		}
		if (str.length() == 0 && str.length() == 1) {
			return str;
		}

		String[] words = str.split(" ");

		if (words.length < 3) {
			return str;
		}

		String third = words[2];

		String revThirdWord = "";

		for (int i = third.length() - 1; i >= 0; i--) {
			revThirdWord = revThirdWord + third.charAt(i);
		}

		words[2] = revThirdWord;

		return String.join(" ", words);

	}

	public static void main(String[] args) {
		String str = "I love java exercise";
		String result = ExerciseFour.thirdWord(str);
		System.out.println(result);
	}

}
