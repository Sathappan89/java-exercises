package W3ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise9 {
	/* Copy Arrays */

	public static void main(String[] args) {
		List<Integer> test = new ArrayList<Integer>();

		test.add(10);
		test.add(5);
		test.add(3);
		test.add(40);
		test.add(1);
		test.add(6);
		
		List<Integer> name = new ArrayList<Integer>();
		name.add(100);
		name.add(555);
		name.add(333);
		name.add(444);
		name.add(111);
		name.add(666);
		System.out.println(test);
		System.out.println(name);
		
		System.out.println("After copy");
		Collections.copy(test, name);
		System.out.println(test);
		System.out.println(name);
	}

}
