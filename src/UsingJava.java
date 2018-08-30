import java.util.*;

public class UsingJava {
	public static void main(String[] args) {
		String strA = "first a short string";
		String strB = "Friends, Romans, countrymen, lend me your ears; I come to bury Caesar, not to praise him;";
		String strC = "this that and the other this does not make sense that toes not either does this";

		int compare = strA.compareTo(strB);
		System.out.println("compare = " + compare);
		if (strA.compareTo(strB) > 0) {
			System.out.println("strA = " + strA);
		} else {
			System.out.println("strB = " + strB);
		}

		compare = strA.compareToIgnoreCase(strB);
		System.out.println("compare = " + compare);
		if (strA.compareToIgnoreCase(strB) > 0) {
			System.out.println("strA = " + strA);
		} else {
			System.out.println("strB = " + strB);
		}

		String searchWord = Utils.getInput("Search for: ");
		int indexOf = strB.indexOf(searchWord);
		if (indexOf != -1) {
			System.out.println("Found " + searchWord + " at index " + indexOf);
		}
		if (strB.contains(searchWord)) {
			System.out.println("Found " + searchWord);
		} else {
			System.out.println("Did not find " + searchWord);
		}

		String[] words = strC.split(" ");
		Set<String> treeSet = new TreeSet<>();
		Set<String> hashSet = new LinkedHashSet<>();
		ArrayList<String> list = new ArrayList<>();
		for (String word : words) {
			System.out.println(word);
			treeSet.add(word);
			hashSet.add(word);
			list.add(word);
		}
		System.out.println("treeSet = " + treeSet);
		System.out.println("hashSet = " + hashSet);
		System.out.println("list = " + list);

		words = strB.split(" ");
		String maxWord = words[0];
		String shortWord = words[0];
		for (String word : words) {
			if (word.length() > maxWord.length()) {
				maxWord = word;
			}
			if (word.length() < shortWord.length()) {
				shortWord = word;
			}
		}
		System.out.println("maxWord = " + maxWord + " has a length of " + maxWord.length());
		System.out.println("shortWord = " + shortWord + " has a length of " + shortWord.length());
		words = strB.split("[,; ]");
		for (String word : words) {
			if (word.length() > 0)
				System.out.println(word);
		}
	}
}
