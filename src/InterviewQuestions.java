public class InterviewQuestions {
	public static void main(String[] args) {
		// drawSquare(Utils.getNumber("How big? "));
		int[] intAr = Utils.getIntArray();
		int max = findMax(intAr);
		System.out.println("max = " + max);

		System.out.println(Utils.getRandomString());
		String[] strAr = Utils.getStrArray();

		printIntArray(intAr);
		printStrArray(strAr);
 	}

	private static void printIntArray(int[] ar) {
		for (int i : ar) {
			System.out.println(i);
		}
	}

	private static void printStrArray(String[] ar) {
		for (String i : ar) {
			System.out.println(i);
		}
	}

	private static int findMax(int[] ar) {
		int max = ar[0];
		for (int i : ar) {
			if (i > max) max = i;
		}
		return max;
	}


	private static void drawSquare(int max) {
		//	here is the top of my box
		for (int x = 0; x < max; x++) {
			System.out.print("v");
		}
		System.out.println();

		for (int s = 0; s < max-2; s++) {
			System.out.print(">");
			//	now print out a bunch of spaces
			for (int i = 0; i < max-2; i++) {
				System.out.print(" ");
			}
			System.out.println("<");
		}

		//	here is the bottom of my box
		for (int x = 0; x < max; x++) {
			System.out.print("^");
		}
	}

	private static void reverse3(String str) {
		String newStr = "";
		String[] aStr;
		aStr = str.split("");
		for (int i = str.length() - 1; i >= 0; i--) {
			newStr += aStr[i];
			System.out.println("newStr = " + newStr);
		}
		String name = "Gary Thomas James";
		System.out.println(whatsMyValue(name));
	}

	private static void reverse2(String str) {
		System.out.println();
		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			newStr += str.charAt(i);
			System.out.println("newStr = " + newStr);
		}
	}

	private static void reverse1(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			newStr = str.charAt(i) + newStr;
			System.out.println("newStr = " + newStr);
		}
	}

	static int whatsMyValue(String name) {
		name = name.toLowerCase();
		int total = 0;
		for (int i = 0; i < name.length(); i++) {
			total += name.charAt(i) - 'a' + 1;
		}
		System.out.format("name = %s has a value of %d%n", name, total);
		return total;
	}

	private static void reverse0(String edgeTech) {
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
		for (int i = edgeTech.length() - 1; i >= 0; i--) {
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
			test += (i % 3) == 0 ? "fizz" : "" ;
			test += (i % 5) == 0 ? "buzz" : "";
			System.out.println(!test.isEmpty() ? test : i);
		}

		for (int i = 1; i <= 20; i++) {
			String test = "";
			if (i % 3 == 0) test += "fizz";
			if (i % 5 == 0) test += "buzz";
			if (!test.isEmpty())
				System.out.println(test);
			else
				System.out.println(i);
		}

		for (int i = 0; i < 20; i++)
			System.out.println(i % 3 == 0 || i % 5 == 0 ? ((i % 3) == 0 ? "fizz" : "") + ((i % 5) == 0 ? "buzz" : "") : i);

	}

}
