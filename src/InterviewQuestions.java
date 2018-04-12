public class InterviewQuestions {
	public static void main(String[] args) {
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
}
