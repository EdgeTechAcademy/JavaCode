public class Junk {
	public static void main(String[] args) {
		fizzBuzz();
		stringReverse();
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
