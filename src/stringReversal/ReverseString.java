package stringReversal;

public class ReverseString {

	public static String rev(String str) {
		
		if(str==null) {
			throw new RuntimeException("str is null");
		}
		
		if(str.length()==1) {
			return str;
		}
		if(str.length()==0) {
			return str;
		}
		
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		String test=ReverseString.rev("chennai");
		System.out.println(test);
	}

}
