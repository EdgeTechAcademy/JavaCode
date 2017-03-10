import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Edge Tech Academy on 3/10/2017.
 */
public class LambdaTester {
	public static void main(String args[]){
		LambdaTester tester = new LambdaTester();

		MathOperation add      = (int a, int b) -> { return a + b; };	// with type declaration, return, and braces
		MathOperation subtract = (int a, int b) ->          a - b;		// with type declaration and without return and braces
		MathOperation multiply = (    a,     b) ->          a * b;   	// without type declaration, return, and braces
		MathOperation divide   = (    a,     b) ->          a / b;		// without type declaration, return, and braces
		MathOperation pow      = (    a,     b) ->  (int)Math.pow((double)a, (double)b);	// a little fancier

		System.out.println(" 40 +    2 = " + tester.operate( 40,   2, add));
		System.out.println("169 -  127 = " + tester.operate(169, 127, subtract));
		System.out.println("  7 x    6 = " + tester.operate(  7,   6, multiply));
		System.out.println("168 /    4 = " + tester.operate(168,   4, divide));
		System.out.println(" 10 ^    5 = " + tester.operate( 10,   5, pow));
		System.out.println("672 x 2^-4 = " + tester.operate(672,   4, (a, b) -> a >> b));

		//without parenthesis
		Greeter greeting1 =  message  -> System.out.println("Hello " + message);

		//with parenthesis
		Greeter greeting2 = (message) -> System.out.println("Hello " + message);
		TimeOfDay time = () -> {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			System.out.println( sdf.format(cal.getTime()) );
		};

		greeting1.sayMessage("Edge Tech Academy");
		greeting2.sayMessage("Let's Learn Lambda Expressions");
		time.getTime();
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface Greeter {
		void sayMessage(String message);
	}

	interface TimeOfDay {
		void getTime();
	}

	private int operate(int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a, b);
	}
}