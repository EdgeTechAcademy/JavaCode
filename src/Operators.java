/**
 * Created by Edge Tech Academy on 12/5/2016.
 */
public class Operators {

	public static void main( String[] args ) {

		int	x, z, n;
		x = 10;
		z = 10;
		n = 10;
		x = x + 1;
		z = z - 1;
		n = n * -1;

		x = 10;
		z = 10;
		n = 10;
		boolean bool = true;
		x++;							// x is now 11
		z--;							// z is now 9
		n = -n;							// n is now -10
		bool = !bool;					// bool is now false

		int i = 3;
		i++;
		System.out.println( i );		// prints 4
		++i;
		System.out.println( i );		// prints 5
		System.out.println( ++i );		// prints 6
		System.out.println( i++ );		// prints 6
		System.out.println( i );		// prints 7

		int yourAge = 62;
		yourAge = yourAge + 10;			// how old will you be in 10 yrs?

		// that seems kind of verbose
		yourAge += 10;					// much cleaner!

		// can that be done with other operators?
		Double pricePaid;
		pricePaid = 100.00;				// original price $100
		pricePaid *= 0.80;				// sale price is 20% off (80% or original)
		pricePaid -= 15.00;				// $15 discount off of sale price
		pricePaid *= 1.0825;			// Taxes added to the final price

		System.out.format("%f %d %d %d %n", pricePaid, x, z, n);

	}
}
