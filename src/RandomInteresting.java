import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * Created by Edge Tech Academy on 3/15/2017.
 */
public class RandomInteresting {
	public static void main(String[] args) {
		System.out.println(factorial(10));
		System.out.println(factorial(9));
		System.out.println(factorial(8));
		System.out.println(factorial(7));
		System.out.println(factorial(5));
		System.out.println(factorial(3));
		System.out.println(factorial(1));
		System.out.println(factorial(0));

		double pi = 0;
		double one = 1;

		long lps = 1_000_000_000 * 2;
		Instant start = Instant.now();

		for (long z = 1; z < lps; z += 2) {
			pi += (one / z);
			one = -one;    // alternate the sign each time
		}
		Instant finish = Instant.now();
		long gap = ChronoUnit.MILLIS.between(start, finish);
		System.out.println("sec " + gap/1000.0 + "\n     PI = " + 4 * pi + "\nMath.PI = " + Math.PI + "\nPI - Math.PI " + (4 * pi - Math.PI)); //PI=3.141592642478473 after 90000000
	}

	public static long factorial ( long base ) {
		return ((base <= 1) ? 1 : base * factorial(base-1));
	}
}
