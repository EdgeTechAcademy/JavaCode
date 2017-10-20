import java.util.Scanner;

/**
 * Created by Edge Tech Academy on 10/18/2017.
 */
public class StringSearch {

	static final String[] names = {"Abe", "Bunny", "Candy", "Donald", "Ephraim", "Fanny", "Gabe", "Honey", "Isaac", "Jake", "Lenny", "Mo"};
	static boolean findStudent(String name) {
		//	TODO #1	insert a loop here to search for the parameter name in the array of names
		//			if you find the name return true if the name is not found return false
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String 	name;

		//	TODO #3 put this code into a loop
		//	exit the loop when the word 'stop' is entered

		System.out.print("Type name to search for -> ");
		name = sc.next();
		boolean found = findStudent(name);

		//	TODO #2 if the name is found print "We found student" + name . If not found print name "was not found"
	}
}
