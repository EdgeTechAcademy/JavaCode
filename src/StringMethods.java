/**
 * Created by Edge Tech Academy on 3/6/2017.
 */
public class StringMethods {
    public static void main(String[] args) {

        String fullPathName = "C:/Projects/firstJava/Verion.1.2.0/src/FirstClass.java";

        int slashIndex = fullPathName.lastIndexOf("/");            // find the last slash
        String fullFileName = fullPathName.substring(slashIndex + 1);    // we found the slash now go 1 more char

        String[] tokens = fullPathName.split("/");                //	What’s the deal with all of the slashes
        for (int i = 0; i < tokens.length; i++)
            System.out.println(i + " " + tokens[i]);
        System.out.println();
        int dotIndex = fullPathName.lastIndexOf(".");

        if (dotIndex >= 0 && slashIndex >= 0) {
            String fileName = fullPathName.substring(slashIndex + 1, dotIndex);
            String extension = fullPathName.substring(dotIndex + 1);
            System.out.println("File name: " + fileName + " ext " + extension);
        } else {
            System.out.println("File name: " + fullPathName + " does not contain proper path name");
        }

        if (fullFileName.endsWith(".java"))
            System.out.println("This is a Java file!");

        String lower = "the lower case string";
        String upper = "THE UPPER CASE STRING";
        //  let's do this with an old fashioned compare
        //  I hope you see the bad logic of these tests!
        //      what if the strings are equal?
        //      the upper string would win
        //      because the else portion of > 0 is <= 0
        if (lower.compareTo(upper) > 0) {
            System.out.println("Who is bigger: " + lower);
        } else {
            System.out.println("Who is bigger: " + upper);
        }

        //  I like this better using the ?: elvis operator
        //  it still hasthe same problem as the code above. Nobody is checking for equal
        System.out.println("Who is bigger: " + (lower.compareTo(upper) > 0 ? lower : upper));
        System.out.println("Who is bigger: " + (lower.compareToIgnoreCase(upper) > 0 ? lower : upper));

        //  let's show what is required to test for less than, greater than AND equals
        System.out.println("Who is bigger: " +
                (lower.compareTo(upper) > 0 ? lower :
                 lower.compareTo(upper) < 0 ? upper : "They are equal"));

        //  basic test for equals. So it only returns true of false
        boolean b = lower.equals("the LOWER case STRING");
        System.out.println("b = " + b);
        b = lower.equalsIgnoreCase("the LOWER case STRING");
        System.out.println("b = " + b);
    }
}
