package praticesPrograms;

public class testingSwitch {

	public static void main(String[] args) {
	
		char vowel='e';
		
	switch (String.valueOf(vowel).toLowerCase().trim()) {
	case "a":
		System.out.println("a is the vowel");
		break;
	case "e":
		System.out.println("a is the vowel");
		break;
	case "i":
		System.out.println("a is the vowel");
		break;
	case "o":
		System.out.println("a is the vowel");
		break;
	case "u":
		System.out.println("a is the vowel");
		break;
	default:
		System.out.println("consonant");
		break;
	}

	}

}
