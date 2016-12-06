/**
 * Created by Edge Tech Academy on 12/5/2016.
 */
public class Char {

	public static void main( String[] args ) {
		char ch = 'a';										// just a single character
		char uniChar = '\u03A9';							// Unicode for uppercase Greek omega character
		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };		// an array of chars

		Character chA = new Character ('A');

		System.out.format ("She said \"Hello!\" to me. %c", ch, charArray[0], uniChar);
	}
}
