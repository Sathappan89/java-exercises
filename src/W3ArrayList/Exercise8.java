package W3ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise8 {

	public static void main(String[] args) {
		List<Integer> test = new ArrayList<Integer>();

		test.add(10);
		test.add(5);
		test.add(3);
		test.add(40);
		test.add(1);
		test.add(6);

		System.out.println("Before sort : " + test);
		Collections.sort(test);
		System.out.println("After sort : " + test);

		System.out.println("---------------------------");

		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println("List before sort: " + list_Strings);
		Collections.sort(list_Strings);
		System.out.println("List after sort: " + list_Strings);

	}

}
