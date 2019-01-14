import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Edge Tech Academy on 10/9/2017.
 */
public class StringMethods {
	public static void main (String[] args) {

		String rick = "Louie, I think this is the beginning of a beautiful friendship.";
		System.out.println(rick + " length " + rick.length());
		//				  0123456789 123456789 123456789 123456789 123456789 123456789
		String renault = "I'm shocked, shocked to find that gambling is going on in here!";
		System.out.println("char 13 " + renault.charAt (13));
		System.out.println("char 1 " + renault.charAt (1));
		System.out.println("char 5 " + renault.charAt (5));
		System.out.println("char 10 " + renault.charAt (10));
		System.out.println("char 23 " + renault.charAt (23));
		renault = renault.replaceFirst("shocked", "SHOCKED");
		System.out.println(renault);

		System.out.println("Play it, Sam. Play ‘As Time Goes By.’".substring (19, 35));
		System.out.println("Play it, Sam. Play ‘As Time Goes By.’".substring (19, 35).length());

		rick = "Of all the gin joints in all the towns in the world, she walks in to mine.";
		System.out.println("rick.length() = " + rick.length());
		System.out.println(renault.charAt (25));

		String quote = "Play it, Sam. Play ‘As Time Goes By.’";
		String subQuote = quote.substring (14, 35);
		System.out.println("subQuote = " + subQuote);

		String x = "Play it, Sam. Play ‘As Time Goes By.’".substring (14, 35);
		System.out.println("x =" + x + "<");

		String school = "Edge Tech Academy";
		int word2 = school.indexOf(' ')+1;
		int word3 = school.indexOf(' ', word2)+1;
		String initials = "" + school.charAt(0) + school.charAt(word2) + school.charAt(word3);
		System.out.println("initials = " + initials);

		String original = "Java Software";
		int   space  = original.indexOf(' ');
		String soft  = original.substring(space+1,space+5);
		String ware  = original.substring(9);
		System.out.println(ware.toUpperCase() + " " + soft.toLowerCase());

		String test = "This is a string with how many words";
		String[] words = test.split(" ");
		System.out.println("this is the 4th word in the string " + words[3]);
		System.out.println("The string had how many words? " + words.length);

		for (int i = 0; i < words.length; i++) {
			System.out.println(i + " words[" + i + "] = " + words[i].charAt(0));
		}

		String replace = original.replace("a","_");
		System.out.println(replace);
		System.out.println(original.replaceFirst("a","_"));

		String name = "Gary Thomas James";
		String[] names = name.split(" ");
		initials = Arrays.stream(names).map(n -> n.substring(0,1)).collect(Collectors.joining(""));
		System.out.println(initials.toLowerCase());

		String barbara = "She said, \"Oh, no you don’t\"\nand I said, “Oh yes I did\"";
		System.out.println(barbara);
		barbara = barbara.replace("She", "Barbara");
		barbara = barbara.replace("did", "DID!");
		barbara = barbara.replace("Oh yes", "Oh, yes");
		System.out.println(barbara);
	}
}
