import java.util.stream.Stream;

/**
 * Created by Edge Tech Academy on 11/16/2016.
 */
public class ColorList {

    // Create an array
    private final static int SIZE = 30;
    private String [] arrayOfColors = new String[SIZE];

    public ColorList() {
        // fill the array with String color values
        String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet", "white", "brown", "black"};
        for (int i = 0; i < SIZE; i++) {
            arrayOfColors[i] = colors[(int)(Math.random()*colors.length)];
            System.out.print(i + "-" + arrayOfColors[i] + " ");
        }
        System.out.println();
    }

    public void printColor(String color) {

        // Print out values of the selected color of the array
        ColorListIterator iterator = this.new ColorIterator(color);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface ColorListIterator extends java.util.Iterator<String> { }

    // Inner class implements the ColorStructureIterator interface,
    // which extends the Iterator<String> interface
    private class ColorIterator implements ColorListIterator {
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        private String color;

        public ColorIterator(String color) {
            this.color = color;
            for (; nextIndex < SIZE; nextIndex++) {
                if (arrayOfColors[nextIndex].equals(color)) {
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
                if (arrayOfColors[nextIndex].equals(color)) {
                    break;
                }
            }
            return retValue;
        }
    }

    public static void main(String s[]) {
        // Fill the array with String color values and
        // print out only values of one color
        ColorList color = new ColorList();
        color.printColor("red");
        color.printColor("yellow");
        color.printColor("blue");
        color.printColor("green");

        //	Or you could replace everything from printColor to the end of the ColorIterator with one Lambda Expression
        Stream.of(color.arrayOfColors)
				.filter (c -> c.equals("red"))
				.forEach(c -> System.out.print(c + " "));
	}
}
