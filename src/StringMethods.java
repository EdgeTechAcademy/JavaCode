import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Edge Tech Academy on 10/9/2017.
 */
public class StringMethods {
	public static void main (String[] args) {

		//	let's create a simple string
		String rick = "Louie, I think this is the beginning of a beautiful friendship.";
		System.out.println(rick + " length " + rick.length());		// how long is it??
		
		//	let's look at some of the individual characters
		//				  0123456789 123456789 123456789 123456789 123456789 123456789
		String renault = "I'm shocked, shocked to find that gambling is going on in here!";
		System.out.println("char 13 " + renault.charAt (13));	//	remember to start at 0
		System.out.println("char 1 " + renault.charAt (1));	//	this is a single quote not the letter I
		System.out.println("char 5 " + renault.charAt (5));
		System.out.println("char 10 " + renault.charAt (10));
		System.out.println("char 23 " + renault.charAt (23));
		renault = renault.replaceFirst("shocked", "SHOCKED");
		System.out.println(renault);

		//	anything inside of double quotes is a string "this is a string" so is this "so is this"
		//	so we can use String methods on the string. This will create a new string with just
		//	'As Time Goes By.'
		System.out.println("Play it, Sam. Play ‘As Time Goes By.’".substring (19, 37));
		System.out.println("Play it, Sam. Play ‘As Time Goes By.’".substring (19, 37).length());

		rick = "Of all the gin joints in all the towns in the world, she walks in to mine.";
		System.out.println("rick.length() = " + rick.length());
		System.out.println(rick.charAt (25));				//  if aI am correct this is the letter 'a'

		String quote = "Play it, Sam. Play ‘As Time Goes By.’";
		String subQuote = quote.substring (14, 35);		// this only copies from >>>'As Time Goes By<<<
		System.out.println("subQuote = " + subQuote);		//	not the closing period or closing quote

		String x = "Play it, Sam. Play ‘As Time Goes By.’".substring (14, 35);
		System.out.println("x =>" + x + "<");			//	the angle brackets just make the substring text stand out

		String school = "Edge Tech Academy";			//	one way to find the initials in a name
		int word2 = school.indexOf(' ')+1;			//	find the first letter after the first space
		int word3 = school.indexOf(' ', word2)+1;		//	start after that space and look for the next space
		String initials = "" + school.charAt(0) + school.charAt(word2) + school.charAt(word3);	//	get first letter from each word
		System.out.println("initials = " + initials);

		String original = "Java Software";
		int   space  = original.indexOf(' ');			//	find space before the 2nd word
		String soft  = original.substring(space+1,space+5);	//	copy the next 4 letters from the letter after the space
		String ware  = original.substring(9);			//	copy from character 9 to the end of the string
		System.out.println(ware.toUpperCase() + " " + soft.toLowerCase());

		String test = "This is a string with how many words";
		String[] words = test.split(" ");			//	split will divide your text into individual words separated by spaces
		System.out.println("this is the 4th word in the string " + words[3]);	//	we now have an array of words
		System.out.println("The string had how many words? " + words.length);	//	the array size is .length. To tell us the element count in the array

		for (int i = 0; i < words.length; i++) {			//	print the individual words
			System.out.println(i + " words[" + i + "] = " + words[i]);
		}

		String replace = original.replace("a","_");		// replace all letter 'a's with an underscore and create a new string
		System.out.println(replace);
		System.out.println(original.replaceFirst("a","_"));	// create a new string that only has the first 'a' replaced

		String name = "Gary Thomas James";
		String[] names = name.split(" ");			// split name on space. code below is fancy way to create initials
		initials = Arrays.stream(names).map(n -> n.substring(0,1)).collect(Collectors.joining(""));
		System.out.println(initials.toLowerCase());

		String barbara = "She said, \"Oh, no you don’t\"\nand I said, “Oh yes I did\"";
		System.out.println(barbara);				// basic string manipulation with replace
		barbara = barbara.replace("She", "Barbara");
		barbara = barbara.replace("did", "DID!");
		barbara = barbara.replace("Oh yes", "Oh, yes");
		System.out.println(barbara);
	}
}
