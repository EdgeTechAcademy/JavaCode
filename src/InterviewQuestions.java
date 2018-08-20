public class InterviewQuestions {
	public static void main(String[] args) {

		fizzBuzz();
		stringReverse();

		String str = "Reverse Me";
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			newStr = str.charAt(i) + newStr;
			System.out.println("newStr = " + newStr);
		}

		System.out.println();
		newStr = "";
		for (int i = str.length()-1; i >= 0; i--) {
			newStr += str.charAt(i);
			System.out.println("newStr = " + newStr);
		}

		System.out.println();
		newStr = "";
		String[] aStr;
		aStr = str.split("");
		for (int i = str.length()-1; i >= 0; i--) {
			newStr += aStr[i];
			System.out.println("newStr = " + newStr);
		}
		String name = "Gary Thomas James";
		System.out.println(whatsMyValue(name));
	}

	static int whatsMyValue(String name) {
		name = name.toLowerCase();
		int total = 0;
		for (int i = 0; i < name.length(); i++) {
			total += name.charAt(i) - 'a' + 1;
		}
		System.out.format("name = %s has a value of %d%n", name, total );
		return total;
	}

	private static void stringReverse() {
		String edgeTech = "abcdefghijklmnopqrstuvwxyz";
		String reverse = "";

		//	print the string out in ascending order A to A
		for (int i = 0; i < edgeTech.length(); i++) {
			System.out.print(edgeTech.charAt(i));
		}
		System.out.println();

		//	read the string in ascending order and
		//	add each new character to start of the string
		for (int i = 0; i < edgeTech.length(); i++) {
			reverse = edgeTech.charAt(i) + reverse;
		}
		System.out.println("reverse = " + reverse);

		System.out.println();
		reverse = "";
		for (int i = edgeTech.length()-1; i >= 0; i--) {
			System.out.print(edgeTech.charAt(i));
			reverse += edgeTech.charAt(i);
			System.out.println(" = " + reverse);
		}
		System.out.println("reverse = " + reverse);
		System.out.println();
	}

	private static void fizzBuzz() {
		for (int i = 1; i <= 20; i++) {
			String test = "";
			test += (i % 3) == 0 ? "fizz" : "";
			test += (i % 5) == 0 ? "buzz" : "";
			System.out.println(!test.isEmpty() ? test : i);
		}

		for (int i = 1; i <= 20; i++) {
			String test = "";
			if (i % 3 == 0)
				test += "fizz";
			if (i % 5 == 0)
				test += "buzz";
			if (! test.isEmpty())
				System.out.println(test);
			else
				System.out.println(i);
		}

		for (int i = 0; i < 20; i++)
			System.out.println(i % 3 == 0 || i % 5 == 0 ? ((i % 3) == 0 ? "fizz" : "") + ((i % 5) == 0 ? "buzz" : "") : i);

	}

}
