package JavaStrings;

public class P1index {
	/*
	 * Write a Java program to get the character at the given index within the
	 * string.
	 */
	/*
	 * Original String = Java Exercises! The character at position 0 is J The
	 * character at position 10 is i
	 * 
	 * 
	 */
	public static void main(String[] args) {

		String Original = "Java Exercises!";
		int j = Original.indexOf("J", 0, Original.length());
		System.out.println("The character at position " + j + " is J");
		int i = Original.indexOf("i", 0, Original.length());
		System.out.println("The character at position " + i + " is I");

	}

}
