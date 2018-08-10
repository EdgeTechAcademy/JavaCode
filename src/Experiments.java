import java.util.Scanner;

public class Experiments {
	public static void main(String[] args) {
		String favoriteFood = "chocolate";
		String birthdayGifts = "I want a pony for my birthday";
		String musicStyle = "My favorite group is the Eagles";
		String myToDoList = "Put the deadbolt locks on the back doors";
		String fruits = "Apple pear peach plum cherry";

		String junk = "that that is is that that is not is not is that it it is";

		//		we are going to test out the toUpperCase, contains, startsWith, endWith, indexOf, lastIndexOf
		favoriteFood = favoriteFood.toUpperCase();
		System.out.println("favoriteFood = " + favoriteFood);

		String test = birthdayGifts.toUpperCase();
		System.out.println("test = " + test + "!");

		int x = test.length();
		System.out.println("The length of the test String is: " + x);
		int index = test.indexOf('Y');
		System.out.println("We found the letter 'Y' at index = " + index);
		boolean match = test.equals("I WANT A pony for my BIRTHDAY");
		System.out.println("match = " + match);
		match = test.equalsIgnoreCase("I WANT A pony for my BIRTHDAY");
		System.out.println("match = " + match);

		String myClass = "Java Programming Language";
		String newStr = myClass.replace('a', '_');
		System.out.println("newStr = " + newStr);
		newStr = myClass.replaceFirst("a", "_");
		System.out.println("newStr = " + newStr);

		int firstA = myClass.indexOf("a");
		int secondA = myClass.indexOf("a", firstA+1);
		System.out.println("firstA  = " + firstA);
		System.out.println("secondA = " + secondA);
		newStr = myClass.substring(0, secondA) + "o" + myClass.substring(secondA +1);
		System.out.println("newStr = " + newStr);

		int z = 1000000;
		newStr = String.valueOf(z);

		newStr = myClass.replace("Java", "Javo");
		System.out.println("newStr = " + newStr);

		index = myToDoList.indexOf("dead");
		System.out.println("indexOf dead = " + index);
		index = junk.lastIndexOf("that");
		System.out.println("indexOf that = " + index);

		boolean didItStartWith = musicStyle.endsWith("Eagles");
		System.out.println("didItStartWith = " + didItStartWith);

		boolean equal = favoriteFood.equals("chocolate");
		System.out.println("equal = " + equal);
		equal = favoriteFood.equalsIgnoreCase("chocolate");
		System.out.println("equal = " + equal);

		String[] aFruit = fruits.split(" ");

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a line of text ");
			String what = sc.nextLine();
			if (what.endsWith("."))
				break;
			System.out.println(what);
			System.out.println("Length = " + what.length());
			System.out.println("How many words? " + what.split(" ").length);
			System.out.println("Does it start with a X? " + what.startsWith("X"));
			System.out.println("Do you see a J in the phrase? " + what.contains("J") + " where was it " + what.indexOf("J"));
		}

//		String prompt = "Give me a number";
//		System.out.print(prompt);
//		String response = sc.nextLine();
//		int number = Integer.parseInt(prompt);

	}
}