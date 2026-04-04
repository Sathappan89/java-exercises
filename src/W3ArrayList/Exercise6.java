package W3ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Write a Java program to remove the third element from an array list.*/
public class Exercise6 {
	public static void main(String[] args) {

		List<Integer> test = new ArrayList<Integer>();
		
		test.add(10);
		test.add(20);
		test.add(30);
		test.add(40);
		test.add(50);
		test.add(60);
		
		System.out.println(test); //[10, 20, 30, 40, 50, 60]
		
		test.remove(3);
		
		System.out.println(test); //[10, 20, 30, 50, 60]
	
	}
}
