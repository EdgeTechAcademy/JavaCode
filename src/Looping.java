import java.util.Scanner;

/**
 * Created by GJames on 11/10/2016.
 */
public class Looping {

    public static int lookingFor(int searchFor) {
        int[] arrayOfInts =
                { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };

        int i;
        int foundIt = -1;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchFor) {
                foundIt = i;
                break;
            }
        }
        return foundIt;
    }

    public static int[] lookingForDouble(int searchFor) {
        int[][] arrayOfInts = {
                { 32,   87,    3, 589 },
                { 12, 1076, 2000,   8 },
                { 622, 127,   77, 955 }
        };

        int i, j;
        int[] foundIt = null;

        search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchFor) {
                    foundIt = new int[] {i, j};
                    break search;
                }
            }
        }
        return foundIt;
    }

    public static int countLetter(String searchMe, char letter) {
        int max = searchMe.length();
        int charCount = 0;

        for (int i = 0; i < max; i++) {
            // interested only in one letter
            if (searchMe.charAt(i) != letter)
                continue;

            // process p's
            charCount++;
        }
        return charCount;
    }

    public static boolean findStingInString(String searchMe, String searchFor) {
        boolean foundIt = false;

        int max = searchMe.length() - searchFor.length();

        test:
        for (int i = 0; i <= max; i++) {
            int n = searchFor.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != searchFor.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
            break test;
        }
        return foundIt;
    }

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n1 while    2 do       3 while2   4 dowhile2\n" +
							     "5 for      6 for:     7 looking  8 double\n" +
							     "9 count   10 findstr    exit");
			String what = sc.nextLine();
			switch (what.toLowerCase()) {
				case "1":
				case "while":
					int count = 1;
					while (count < 11) {
						System.out.println("Loop 1: Count is: " + count);
						count++;
					}
					break;

				case "2":
				case "do":
					//  how is the output different between these two while loops?
					count = 1;
					do {
						System.out.println("Loop 2: Count is: " + count);
						count++;
					} while (count < 11);
					break;

				case "3":
				case "while2":
					count = 11;
					//  how is the output different between these two while loops?
					while (count < 11) {
						System.out.println("Loop 3: Count is: " + count);
						count++;
					}
					break;

				case "4":
				case "dowhile2":
					count = 11;
					do {
						System.out.println("Loop 4: Count is: " + count);
						count++;
					} while (count < 11);
					break;

				case "5":
				case "for":
					for (int i = 1; i < 11; i++) {
						System.out.println("For inc: Count is: " + i);
					}
					break;

				case "6":
				case "for:":
					int[] numbers =
							{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
					for (int item : numbers) {
						System.out.println("For item: Count is: " + item);
					}
					break;

				case "7":
				case "looking":
					int searchFor = 12;
					int foundIt = Looping.lookingFor(searchFor);

					if (foundIt >= 0) {
						System.out.println("Found " + searchFor + " at index " + foundIt);
					} else {
						System.out.println(searchFor + " not in the array");
					}
					break;

				case "8":
				case "double":
					searchFor = 12;
					int[] foundIt2;
					foundIt2 = Looping.lookingForDouble(searchFor);

					if (foundIt2 != null) {
						System.out.println("Found " + searchFor + " at [" + foundIt2[0] + ", " + foundIt2[1] + "]");
					} else {
						System.out.println(searchFor + " not in the array");
					}
					break;

				case "9":
				case "count":
					char letter = 'p';
					String searchMe = "peter piper picked a peck of pickled peppers";
					int charCount = Looping.countLetter(searchMe, letter);
					System.out.println("Found " + charCount + " " + letter + "'s in the string.");
					break;

				case "10":
				case "findstr":
					searchMe = "Look for a substring in me";
					String searchForSub = "sub";
					boolean subFound = findStingInString(searchMe, searchForSub);
					System.out.println((subFound ? "Found: '" : "Didn't find: '") + searchForSub + "' in: " + searchMe);
					break;

				case "exit"	:
					return;
			}
		}
	}
}
