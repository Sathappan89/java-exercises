package SDET_InterviewQuestions_Set1;

/*
 * 
 *    *
 *    1  2
 *    *  *  *
 *    1  2  3  4
 * 
 * */
public class P17_PatternProgram {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i >= j) {
					if (i % 2 == 1) {
						System.out.print(String.valueOf("*")+ " ");
					}
					if (i % 2 == 0) {
						System.out.print(j + " ");
					}
				}
			}
			System.out.println(" ");
		}
	}
}