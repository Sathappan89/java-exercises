package W3ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise7 {
	// Write a Java program to search for an element in an array list.
	public static void main(String[] args) {
		List<Integer> test = new ArrayList<Integer>();

		test.add(10);
		test.add(20);
		test.add(30);
		test.add(40);
		test.add(50);
		test.add(60);

		System.out.println(test); // [10, 20, 30, 40, 50, 60]
		
		if(test.contains(10)) {
			System.out.println("found element");
		}else {
			System.out.println("elements not found");
		}

	}

}
