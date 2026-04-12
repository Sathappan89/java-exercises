package SDET_InterviewQuestions_Set3;

public class ExerciseSix {
	/* Count vowels and consonants */
	/* q e i o u */
	public static void main(String[] args) {
		String str = "I live to learn Java strings";

        int countVowels = 0;
        int countConsonants = 0;

        for (int i = 0; i < str.length(); i++) { 
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z') {        // Only letters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countVowels++;
                } else {
                    countConsonants++;
                }
            }
        }

        System.out.println("Vowels count      : " + countVowels);
        System.out.println("Consonants count  : " + countConsonants);
	}

}
