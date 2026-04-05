package W3HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Findwords {

	public static void main(String[] args) {
		String str = "I love Selenium with Java Coding";

		// Split the string into words
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words)); // [I, love, Selenium, with, Java, Coding]

		// Create a HashMap to store index → word
		HashMap<Integer, String> map = new HashMap<>();

		// put words into the map
		for (int i = 0; i < words.length; i++) {
			map.put(i, words[i]);
		}

		System.out.println(map); // {0=I, 1=love, 2=Selenium, 3=with, 4=Java, 5=Coding}
		System.out.println(map.entrySet()); // [0=I, 1=love, 2=Selenium, 3=with, 4=Java, 5=Coding]
		System.out.println(map.keySet()); // [0, 1, 2, 3, 4, 5]
		System.out.println(map.values()); // [I, love, Selenium, with, Java, Coding]
		System.out.println(map.get(4)); // Java

		// Print only "Java"
		for (String value : map.values()) {
			if (value.equals("Java")) {
				System.out.println(value); // Java
			}
		}

		System.out.println("-------Iterator-------------");

		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------for each-------------");
		
		
		for(Entry<Integer, String> x:map.entrySet()) {
			if(x.getValue().contains("Java")) {
				System.out.println(x.getValue()+ " = " +x.getKey());
			}
		}
		
		
	}

}
