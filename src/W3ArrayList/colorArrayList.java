package W3ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class colorArrayList {

	public static void main(String[] args) {
		
		List <String> color = new ArrayList<String>();
		color.add("White");
		color.add("Black");
		color.add("Orange");
		color.add("Red");
		color.add("Green");
		color.add("Yello");
		
		System.out.println(color); //[White, Black, Orange, Red, Green, Yellow]
		
		System.out.println("Size of the arryaList : " + color.size());
		
		System.out.println("------for each loop-----------");
		
		for(int i=0;i<color.size();i++) {
			System.out.println(i+ " = "+color.get(i));
		}
		
		System.out.println("------for indexing-----------");
		
		for(Object x:color) {
			System.out.println(x);
		}
		
		System.out.println("------Iterator-----------");
		
		Iterator it=color.iterator();
		
		System.out.println("------Iterator loop-----------");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
