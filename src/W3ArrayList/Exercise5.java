package W3ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise5 {
	/* Write a Java program to update an array element by the given element. */
	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("India");
		arr.add("USA");
		arr.add("UK");
		arr.add("UAE");
		arr.add("SINGAPORE");
		
		System.out.println(arr);
		int sizeofArray = arr.size();
		System.out.println("Size of the Array : " + sizeofArray);
		
		arr.add(1, "United State of America");
		System.out.println(arr);
		
		arr.set(2, "United Kindom");
		System.out.println(arr);
		
		System.out.println("--------Iterator Cursor-----------");
		
		Iterator<String> country = arr.iterator();
		
		while(country.hasNext()) {
			System.out.println(country.next());
		}
		
		
	}

}
