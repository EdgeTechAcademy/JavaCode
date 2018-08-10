import java.util.Scanner;

public class Utils {
	public static String getInput(String prompt) {
		Scanner sc = new Scanner((System.in));
		System.out.print(prompt);
		String response = sc.nextLine();
		return response;
	}

	public static int getInteger(String prompt) {
		int number;
		do {
			String response = getInput(prompt);
			try {
				number = Integer.parseInt(response);
				break;
			} catch (NumberFormatException e) {
				continue;
			}
		} while(true);
		return number;
	}

	public static int getInteger(String prompt, int max) {
		int number;
		do {
			number = getInteger(prompt);
		} while (number < max);
		return number;
	}

	public static void main(String[] args) {
		//int z = getInput("Hey! ", 10);
	}
}
