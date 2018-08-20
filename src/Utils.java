import java.util.Scanner;

public class Utils {

	static Scanner sc = new Scanner((System.in));

	public static String getInput(String prompt) {
		System.out.print(prompt);
		String response = sc.nextLine();
		return response;
	}

	public static int getInteger(String prompt) {
		int number = 0;
		do {
			String response = getInput(prompt);
			try {
				number = Integer.parseInt(response);
				break;
			} catch (NumberFormatException e) {
				System.out.println( response + " Is not a number");
				continue;
			}
		} while(true);
		return number;
	}

	public static int getInteger(String prompt, int max) {
		int number;
		do {
			number = getInteger(prompt);
		} while (number > max);
		return number;
	}

	public static void main(String[] args) {
		int z = getInteger("Enter a number less than or equal to 10! ", 10);
		System.out.println("User entered: " + z);
	}
}
