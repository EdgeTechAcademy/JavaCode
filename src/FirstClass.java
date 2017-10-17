import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Edge Tech Academy on 10/9/2017.
 */
public class FirstClass {
	public static void main (String[] args) {

		String rick = "Louie, I think this is the beginning of a beautiful friendship.";
		System.out.println(rick + " length " + rick.length());
		String renault = "I'm shocked, shocked to find that gambling is going on in here!";
		System.out.println("char 13 " + renault.charAt (13));
		renault = renault.replaceFirst("shocked", "SHOCKED");
		System.out.println(renault);
		System.out.println("Play it, Sam. Play ‘As Time Goes By.’".substring (19, 35));
		System.out.println("Play it, Sam. Play ‘As Time Goes By.’".substring (19, 35).length());

		String original = "Java Software";
		int   space  = original.indexOf(' ');
		String soft  = original.substring(space+1,space+5);
		String ware  = original.substring(9);
		System.out.println(ware.toUpperCase() + " " + soft.toLowerCase());

		String[] words = "This is a string with how many words".split(" ");
		System.out.println("this is the 4th word in the string " + words[3]);
		System.out.println("The string had how many words? " + words.length);

		String replace = original.replace("a","_");
		System.out.println(replace);
		System.out.println(original.replaceFirst("a","_"));

		String name = "Gary Thomas James";
		String intials;
		String[] names = name.split(" ");
		String initials = Arrays.stream(names).map(n -> n.substring(0,1)).collect(Collectors.joining(""));
		System.out.println(initials.toLowerCase());

		String barbara = "She said, \"Oh, no you don’t\"\nand I said, “Oh yes I did\"";
		System.out.println(barbara);
		barbara = barbara.replace("She", "Barbara");
		barbara = barbara.replace("did", "DID!");
		barbara = barbara.replace("Oh yes", "Oh, yes");
		System.out.println(barbara);
	}
}
