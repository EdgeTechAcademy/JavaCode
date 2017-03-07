/**
 * Created by gjames on 3/7/2017.
 */
public class IfThenElse {
	public static void main (String[] args) {
			int testscore = (args.length == 1) ? Integer.parseInt(args[0]) : 33;
		char grade;
		if (testscore >= 90) {
			grade = 'A';
		} else if (testscore >= 80) {
			grade = 'B';
		} else if (testscore >= 70) {
			grade = 'C';
		} else if (testscore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println ("Grade = " + grade);
	}
}
