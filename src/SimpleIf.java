public class SimpleIf {
	public static void main(String[] args) {

		//	let's ask the user for two numbers and compare them
		int num1, num2;
		num1 = Utils.getNumber("Enter # 1: ");
		num2 = Utils.getNumber("Enter # 2: ");
		if (num1 == num2) {
			System.out.println("the numbers are both equal to: " + num1);
		}
		if (num1 >= num2) {
			System.out.println(num1 + " is greater than or equal to " + num2);
		}
		if (num1 < num2) {
			System.out.println(num1 + " is less than to " + num2);
		}

		//	let's grab two strings and compare them
		String str1, str2;
		str1 = Utils.getInput("Enter a string 1 ");
		str2 = Utils.getInput("Enter a string 2 ");

		//	the equals method just says yes or no they are identical strings
		if (str1.equals(str2)) {
			System.out.println("The two strings are equal to: " + str1);
		}

		//	Now we will use the compareTo method
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Ignore case: The two strings are equal to: " + str1);
		}
		if (str1.compareTo(str2) == 0) {
			System.out.println("The two strings are equal " + str1);
		} else if (str1.compareTo(str2) > 0) {
			System.out.println(str1 + " is bigger than " + str2);
		} else {
			System.out.println(str2 + " is bigger than " + str1);
		}
	}
}
