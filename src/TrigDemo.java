/**
 * Created for Edge Tech Academy on 11/9/2016.
 *  Showing off the Java Trig functions
 */
public class TrigDemo {
    public static void main(String[] args) {
        double degrees = 30.0;
        double radians = Math.toRadians(degrees);

        //  Let's see how well you remember 11th grade Trig
        System.out.format("The value of pi " + "is %.4f%n", Math.PI);

        System.out.format("The sine    of %.1f " + "degrees is %.4f%n", degrees, Math.sin(radians));
        System.out.format("The cosine  of %.1f " + "degrees is %.4f%n", degrees, Math.cos(radians));
        System.out.format("The tangent of %.1f " + "degrees is %.4f%n", degrees, Math.tan(radians));

        for ( double d = 0.0; d <= 2 * Math.PI; d += 0.1) {
            int sinValue = (int)(Math.cos(d) * 20) + 20;
            String histogram = "-------------------+....................".substring(0, sinValue);
            System.out.format("Degrees %3d %5.2f %s %n", (int)Math.toDegrees(d), Math.cos(d), histogram);
        }
    }
}