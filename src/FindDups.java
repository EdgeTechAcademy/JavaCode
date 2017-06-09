/**
 * Created by Edge Tech Academy on 3/1/2017.
 */

import java.util.*;

public class FindDups {
	public static void main(String[] args) {

		//	add all command line arguments to a String Set
		Set<String> s = new HashSet<String>();
		for (String a : args)
			s.add(a);
		System.out.println(s.size() + " distinct words: " + s);

		//	Create a Set of unique words and one with the dups
		Set<String> uniques = new HashSet<String>();
		Set<String> dups    = new HashSet<String>();

		for (String a : args) {
			//	add the word to the uniques Set
			//	if the word is not there it is added and True (object was added) is returned
			//	if the word is already in the Set then nothing is added and False (not added) is returned
			if ( ! uniques.add(a) ) {
				//	the add did not add so it is a dup. Add it to the dups Set
				dups.add(a);	//	If we have dups in dups we don't care, even though only one is added
			}
		}

		//	Destructive set-difference
		//	Remove the duplicated words from the uniques
		uniques.removeAll(dups);

		System.out.println("Unique words:      " + uniques);	//	these words only appear once
		System.out.println("Duplicate words:   " + dups);		//	these words appear 2 or more times

		List<String> list = Arrays.asList (args);
		System.out.println (list);
		Collections.shuffle (list);
		System.out.println (list);
		Collections.shuffle (list);
		System.out.println (list);
	}
}
