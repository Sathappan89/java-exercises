package StringAssignments;

public class Reverse {
	
	public static String Reverses(String str) {
		
		if(str==null) {
			throw new RuntimeException ("Str is null");
		}
		
		if(str.length()==0) {
			return str;
		}
		
		if(str.length()==1) {
			return str;
		}
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		String result=Reverse.Reverses("Java");
		System.out.println(result);
	}
	
}
