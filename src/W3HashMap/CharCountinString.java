package W3HashMap;

import java.util.HashMap;

public class CharCountinString {

	public static void main(String[] args) {
	
		String str = "Sathappan";
		
		HashMap <Character, Integer> map = new HashMap<>();
		
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1); //a=1+1 ; p=1+1; a=2+1 ;
			}
			else {
				map.put(ch, 1); //S=1 ; a=1; t=1; h=1; p=1 ; n=1
			}
			
		}
		System.out.println(map);//{p=2, a=3, S=1, t=1, h=1, n=1}
		System.out.println(map.entrySet());//[p=2, a=3, S=1, t=1, h=1, n=1]
		System.out.println(map.keySet());//[p, a, S, t, h, n]
		System.out.println(map.values()); //[2, 3, 1, 1, 1, 1]
		System.out.println(map.get('p')); //2

	}

}
