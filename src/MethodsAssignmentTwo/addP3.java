package MethodsAssignmentTwo;

/*
 * Method with Return Value(boolean) and with Parameters (String,String):
 * Assignment : Write a method to compare two string and return true if they are equal, false otherwise
 * Signature: public boolean compareString(String str1,String str2)
 * */
public class addP3 {

	public static boolean compareString(String str1, String str2) {

		if (str1 == null || str2 == null) {
			return false;
		}
		else {
		return str1.equals(str2);
		}

	}

	public static void main(String[] args) {
		boolean re=compareString("test","test");
		System.out.println(re);
	}

}
