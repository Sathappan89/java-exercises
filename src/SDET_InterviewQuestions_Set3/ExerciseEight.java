package SDET_InterviewQuestions_Set3;

public class ExerciseEight {
/*Remove whitespaces from a string*/
	public static void main(String[] args) {
		String str="I live to learn Java Testing";
		char[] ch = str.toCharArray();
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb.toString());
	}

}
