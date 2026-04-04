package W3ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {

	public static void main(String[] args) {

		List<Object> Employee = new ArrayList<Object>();
		Employee.add("Sathappan");
		Employee.add(25);
		Employee.add('M');
		Employee.add("Arizona");
		Employee.add(266687);

		System.out.println(Employee.size());
		System.out.println(Employee);

		System.out.println("-------For Loop in INDEX------------");

		for (int i = 0; i < Employee.size(); i++) {
			System.out.println(i + " = " + Employee.get(i));
		}

	}

}
