package W3HashMap;

import java.util.HashMap;

public class Exercise8 {
	/*
	 * Write a Java program to test if a map contains a mapping for the specified
	 * value.
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		hash_map.put(6, "Blue");
		
		
		 if (hash_map.containsValue("Green")) {
			 System.out.println("Yes !!");
		 }
		 else {
			 System.out.println("No !!");
		 }
		
	}

}
