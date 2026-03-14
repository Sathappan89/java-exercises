package MethodAssignments;
/*Write a program which will ask the user to enter his/her marks(out of 100).
 * Define a method that will display grades according to the marks entered as below:
 * */
public class GradeSystem {

	public String StudentResult(int marks) {
		
		String grade="";
		
		if(marks >=91 && marks<=100) {
			return "AA";
		}
		else if(marks >=81 && marks<=90) {
			return "AB";
		}
		else if(marks >=71 && marks<=80) {
			return "BB";
		}
		else if(marks >=61 && marks<=70) {
			return "BC";
		}
		else if(marks >=51 && marks<=60) {
			return "CD";
		}
		else if(marks >=41 && marks<=50) {
			return "DD";
		}
		else {
			return "Fail";
		}
	}
	
	
	public static void main(String[] args) {
		GradeSystem gs = new GradeSystem();
		String result = gs.StudentResult(98);
		System.out.println(result);
		
	}

}
