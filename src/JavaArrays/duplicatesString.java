package JavaArrays;

public class duplicatesString {
//Find duplicates in string array
	public static void main(String[] args) {
		String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		
		int len = my_array.length;
		System.out.println(len);

		String li = my_array[0];
		String hi = my_array[len-1];
		
		
		
		for(int i=0;i<len-1;i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if (my_array[i].equals(my_array[j])) {
                    System.out.println(my_array[i]);
                }
			}
			
		}
		

	}

}
