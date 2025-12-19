package JavaStrings;

public class P2index {
/*Write a Java program to get the character (Unicode code point) at the given index within the string.*/
	public static void main(String[] args) {
		String str = "w3resource.com";
		System.out.println("Original String : " + str);
		int val1 = str.codePointAt(1);
	    int val2 = str.codePointAt(9);
	    System.out.println("Character(unicode point) = " + val1);
	    System.out.println("Character(unicode point) = " + val2);

	}

}
