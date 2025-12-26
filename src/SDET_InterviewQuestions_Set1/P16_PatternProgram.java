package SDET_InterviewQuestions_Set1;
/*4 3 2 1
 *3 2 1
 *2 1
 *1
 **/
public class P16_PatternProgram {

	public static void main(String[] args) {
		
		for(int i=4;i>=1;i--) {
			for(int j=4;j>=1;j--) {
				if(i>=j) {
				System.out.print(j + " ");
				}
			}
			System.out.println(" ");
		}

	}

}
