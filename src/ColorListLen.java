import java.util.stream.Stream;

/**
 * Created by Edge Tech Academy on 11/16/2016.
 */
public class ColorListLen {

	// Create an array
	private final static int SIZE = 30;
	private String [] arrayOfColors = new String[SIZE];

	public ColorListLen() {
		// fill the array with String color values
		String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet", "white", "brown", "black"};
		for (int i = 0; i < SIZE; i++) {
			arrayOfColors[i] = colors[(int)(Math.random()*colors.length)];
			System.out.print(i + "-" + arrayOfColors[i] + " ");
		}
		System.out.println();
	}

	public void printColorLen(int len) {

		// Print out values of the selected color of the array
		System.out.println("Color Length: " + len);
		ColorLenIterator iterator = this.new LenIterator(len);
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

	interface ColorLenIterator extends java.util.Iterator<String> { }

	// Inner class implements the ColorStructureIterator interface,
	// which extends the Iterator<String> interface
	private class LenIterator implements ColorLenIterator {
		// Start stepping through the array from the beginning
		private int nextIndex = 0;
		private int len;

		public LenIterator(int len) {
			this.len = len;
			for (; nextIndex < SIZE; nextIndex++) {
				if (arrayOfColors[nextIndex].length() == len) {
					break;
				}
			}
		}

		public boolean hasNext() {
			// Check if the current element is the last in the array
			return (nextIndex < SIZE);
		}

		public String next() {
			// Find the next value of the selected color of the array
			String retValue = String.valueOf(arrayOfColors[nextIndex]);

			// Get the next color element defined for this iteration
			for (nextIndex++; nextIndex < SIZE; nextIndex++) {
				if (arrayOfColors[nextIndex].length() == len) {
					break;
				}
			}
			return retValue;
		}
	}

	public static void main(String s[]) {
		// Fill the array with String color values and
		// print out only values of one length
		ColorListLen color = new ColorListLen();

		color.printColorLen(3);
		color.printColorLen(4);
		color.printColorLen(5);
		color.printColorLen(6);
		//	Or you could replace everything from printColor to the end of the ColorIterator with one Lambda Expression
		Stream.of(color.arrayOfColors)
				.filter (c -> c.length() == 5)
				.forEach(c -> System.out.print(c + " "));
	}
}
