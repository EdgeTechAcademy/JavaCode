/**
 * Created by Edge Tech Academy on 3/1/2017.
 */

import java.util.*;

public class FindDups {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		for (String a : args)
			s.add(a);
		System.out.println(s.size() + " distinct words: " + s);

		s.clear();
		for (String a : args)
			s.add (a);
		System.out.println (s.size () + " distinct words: " + s);

		Set<String> uniques = new HashSet<String>();
		Set<String> dups    = new HashSet<String>();

		for (String a : args)
			if (!uniques.add(a))
				dups.add(a);

		// Destructive set-difference
		uniques.removeAll(dups);

		System.out.println("Unique words:    " + uniques);
		System.out.println("Duplicate words: " + dups);
	}
}
