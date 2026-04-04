package W3ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		
		System.out.println(list_Strings);

		list_Strings.add(0, "Grey");
		
		list_Strings.add(6, "DrakGrey");
		
		System.out.println(list_Strings);
	}

}
