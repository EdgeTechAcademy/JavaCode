/**
 * Created by Edge Tech Academy on 6/9/2017.
 */
import java.util.*;
import java.io.*;

public class Anagrams {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("missing arguments: dictionary and word length or word");
			return;
		}

		// Read words from file and put into a simulated multimap
		Map<String, List<String>> m = new HashMap<String, List<String>>();

		try {
			//	read every line from the dictionary file
			Scanner s = new Scanner(new File(args[0]));
			while (s.hasNext()) {					//	as long has we have words keep reading
				String word = s.next();
				String alpha = alphabetize(word);
				List<String> l = m.get(alpha);		//	does an entry exist for this anagram
				if (l == null)						//	if this word is not yet in the list
					m.put(alpha, l=new ArrayList<String>());	//	create an entry with an empty list
				l.add(word);						//	add the word to the list.
			}
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}

		//	all words are now in a multilist.
		//		The key is the anagram of the word
		//		The value is the list of words matching that anagram
		try {
			//	did the user pass in a number?
			//		if so we are going to dump all words that are of anagramLen or greater
			int anagramLen = Integer.parseInt(args[1]);

			// Print all permutation groups above size threshold
			for (List<String> l : m.values())
				if (l.size() >= anagramLen)
					System.out.println(l.size() + ": " + l);
		}
		catch (Exception e) {
			//	the parsing of the integer failed.
			//		there might be cleaner ways of doing this but oh well
			//		what we have now is a word in args[1]
			//		alphabetize it and show the words with matching anagrams
			String anagram = alphabetize(args[1]);
			List<String> l = m.get(anagram);
			System.out.println(l.size() + ": " + l);
		}
	}

	//	make word ready to be anagramized, by alphabetizing the characters
	private static String alphabetize(String s) {
		char[] a = s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}
}