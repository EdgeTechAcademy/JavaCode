/**
 * Created by Edge Tech Academy on 11/9/2016.
 *      Base Math
 */
public class BasicMath {
    public static void main(String[] args) {
        double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45;

        System.out.printf("The absolute value " + "of %.3f is %.3f%n",  a, Math.abs(a));
        System.out.printf("The ceiling of " + "%.2f is %.0f%n",         b, Math.ceil(b));
        System.out.printf("The floor of " + "%.2f is %.0f%n",           b, Math.floor(b));
        System.out.printf("The rint of %.2f " + "is %.0f%n",            b, Math.rint(b));
        System.out.printf("The max of %d and " + "%d is %d%n",       c, d, Math.max(c, d));
        System.out.printf("The min of of %d " + "and %d is %d%n",    c, d, Math.min(c, d));

        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of " + "e is %.4f%n",         Math.E);
        System.out.printf("exp(%.3f) " + "is %.3f%n",           x, Math.exp(x));
        System.out.printf("log(%.3f) is " + "%.3f%n",           x, Math.log(x));
        System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n",  x, y, Math.pow(x, y));
        System.out.printf("sqrt(%.3f) is " + "%.3f%n",          x, Math.sqrt(x));
    }
}
