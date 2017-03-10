/**
 * Created by Edge Tech Academy on 3/10/2017.
 */
public class LambdaAssignment {
	public static void main(String args[]){
		LambdaAssignment tester = new LambdaAssignment();

		MathOperation add      = (int a, int b) -> { return a + b; };	// with type declaration, return, and braces
//		TODO:	MathOperation subtract = make a Lambda expresson for subtract
//		TODO:	add the others here: subtract, multiply, divide and mod, pow

		System.out.println(" 40 +    2 = " + tester.operate( 40,   2, add));
//		TODO:	System.out.println("?num - ?num = " + tester.operate(?num,   ?num, subtract));
//		TODO:	System.out.println("?num * ?num = " + tester.operate(?num,   ?num, multiply));
//		TODO:	System.out.println("?num / ?num = " + tester.operate(?num,   ?num, divide));
//		TODO:	System.out.println("?num % ?num = " + tester.operate(?num,   ?num, mod));
//		TODO:	System.out.println("?num ^ ?num = " + tester.operate(?num,   ?num, pow));
//		TODO:	System.out.println("?num - ?num = " + tester.operate(?num,   ?num, _______________________

		//	TODO:	without parentheses
		//Greeter greeting = //	your Lambda expression here. All in line

//		greeting.saySomething("Edge Tech Academy");

//		TimeOfDay time = () -> {
//			//	TODO: Get the current time and print it here.
//		};

//		time.getTime();
	}

	private int operate(int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a, b);
	}

	/*
	 *	Interface definitions used in our application.
	 *	Some are finished some are not.
	 *	You get to finish them off.
	 */
	interface MathOperation {
		int operation(int a, int b);
	}

	interface Greeter {
		//	TODO: interface method here. no return and just a single parameter
	}

	interface TimeOfDay {
		//	TODO:	interface method here. no return and no parameters
	}
}