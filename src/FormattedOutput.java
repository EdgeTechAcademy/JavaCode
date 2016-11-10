import java.util.Calendar;

/**
 * Created by Edge Tech Academy on 11/9/2016.
 */
public class FormattedOutput {
    public static void main(String[] args) {
        long n = 1123458;
        System.out.format("%d%n", n);      //  -->  "1123458"
        System.out.format("%09d%n", n);    //  -->  "001123458"
        System.out.format("%+9d%n", n);    //  -->  " +1123458"
        System.out.format("%,9d%n", n);    // -->  " 1,123,458"
        System.out.format("%+,9d%n%n", n); //  -->  "+1,123,458"

        double pi = Math.PI;

        System.out.format("%f%n", pi);       // -->  "3.141593"
        System.out.format("%.3f%n", pi);     // -->  "3.142"
        System.out.format("%10.3f%n", pi);   // -->  "     3.142"
        System.out.format("%-10.3f%n", pi);  // -->  "3.142"

        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2017"
        System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"
        System.out.format("%tD%n", c);    // -->  "05/29/17"
        Character ch = new Character('a');
        ch = 'z';
        System.out.format("%c%n", ch);    // -->  "05/29/17"
        int	x, y, z;
        x = 10;
        y = 0;
        z = 5;
        z -= --x - y--;
        System.out.printf ("X is now %d%nY is now %d and%nZ is now %d", x, y, z);


    }
}
