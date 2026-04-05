package W3HashMap;

//Write a Java program to count the number of key-value (size) mappings in a map
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise2 {

	public static void main(String[] args) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Yellow");
		hash_map.put(4, "Orange");
		hash_map.put(5, "Grey");

		int size = hash_map.size();
		System.out.println(size);
	}

}
