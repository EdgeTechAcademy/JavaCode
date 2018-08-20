/**
 * Created by Edge Tech Academy on 10/19/2017.
 */
public class Methods {

	//	We are not going to worry about Classes for now so these examples will all be of the static variety.
	//	the method will have a job to do. Everything it needs to know will get passed in by the calling method, which will be main


	//--------------------------------------------------------------------------------------------------------
	//	let's start with a simple no parameter method
	//	this method is all ready complete and ready to use
	//
	// 	a method is defined by what it
	// 		returns - here we return nothing so we use the key word void.
	//		is named - this method is named hello. Anyone that wants to use it just uses hello() in their code
	//		it receives (parameters) - we put the parameters between parenthesises, more later
	//		does - what it does is the code between the opening { and the closing }
	static void helloWorld() {
		//	this guy only prints a single message.
		System.out.println("Hello World! Can anyone hear me?");
		//	and nothing is returned.
		//	when the code hits the closing } is just returns execution back to the calling method
	}


	//--------------------------------------------------------------------------------------------------------
	//	this method is all ready complete and ready to use
	//	this method takes one parameter
	//
	// 		message -	the parameters are listed between the () after the method name
	//					parameters ALWAYS include a type (int, String, float,...) and a name
	//					they look exactly like the definition of a variable.
	static String saySomething(String message) {

		//	take our one parameters message and display it
		System.out.println(message);

		//	for no particular reason except to show how return works
		//	we will return the original string and UPPER CASE it
		return message.toUpperCase();
	}


	//--------------------------------------------------------------------------------------------------------
	//		this method is all ready complete and ready to use
	//
	// 		just a slight step up. now we have two parameters
	//		two integers to be added
	static int addTwoNumbers(int num1, int num2) {

		//	this is not necessary to create a new variable to hold the sum
		//	we could use this code return num1 + num2;
		int num = num1 + num2;
		return num;
	}


	//--------------------------------------------------------------------------------------------------------
	//	this one is for you to complete
	//
	//	take these two paramters and concatenate them together and return the new string
	static String combineStrings(String strA, String strB) {
		//	TODO add the code that will return the two strings together
		String msg = strA + strB;
		//	TODO delete this line of code. It is here only to let the compiler be happy
		// 	until you put in the correct line of code where the two strings are combined.
		return msg;
	}


	//--------------------------------------------------------------------------------------------------------
	//	TODO this method is for you to write.
	//	create a method that:
	//				returns a 			String
	//				has three parameters. You decide the type for each parameter
	//					1st parameter	name		just someone's name
	//					2nd parameter 	age			how old the person is now
	//					3rd parameter	year		year the person was born
	//				method name 		my100thBirthday
	//				does 				prints a message that says
	// 									"Jack, you will be 100 years old in 2074"
	//									"Bobby, you will be 100 years old in 2099"
	//
	//	just a reminder: the example for this method will start with
	// 			public static		then you will have the
	// 			return type			followed by
	// 			function name		followed by
	//			(		param list is enclosed in parens
	//			the list of parameters
	//				a parameter has a type and a name
	//				if there are more than one param the are separated by commas
	//			)		last param is followed by a closing paren
	//			{		code is between an opening {
	//										code goes in here
	//			}		and a closing 		}
	//	TODO add your code in here






	//--------------------------------------------------------------------------------------------------------
	//	another method for you to write
	//	sumArray
	// 		has one parameter		theArray an integer array
	//		it returns an integer 	return value is the sum of all of the elements in the array
	//		loop through the array and add up each element;
	//
	static int sumArray(int[] theArray) {
		int sum = 0;
		//	TODO	add the code to sum the elements in the array
		//			here is how you access the elements of an array
		//			the first element of the array is theArray[0]
		//			element 2 is theArray[0]
		//			the length of the array is theArray.length
		//			use the loop variable to get to the values of each element in the array

		return sum;
	}

	//--------------------------------------------------------------------------------------------------------
	//	another method for you to write
	//	averageArray
	// 		has one parameter		theArray an integer array
	//		return value is the average of the elements of the array. What should the return type be???
	//
	//		TODO	you have a method to calculate the sum of an array
	//				why not use that method to calculate the average of the numbers in the array
	//	TODO 	change the type from String to whatever is appropriate
	static String averageArray(int [] theArray) {
		//	TODO add your code here to calculate the average
		//		remember you have some code already that will sum an array
		//		you might what to use it

		//	TODO of course this line is wrong, but we have it here to make the compiler happy for now.
		return " !!! change this !!!! ";
	}



	//--------------------------------------------------------------------------------------------------------
	//
	// 	main is here for you to test out your methods
	//	in the real world your methods will be called by other applications
	//	when they need work done that only your code knows how to do
	//
	public static void main(String[] args) {

		//	call the hello method. no parameters, nothing returned. kind of sad and lonely
		//	helloWorld is just a beginners method
		helloWorld();

		//	Now we want to say more than hello world.
		//	just create a string and pass it into the saySomething method
		saySomething("I was just passed into the saySomething method");
		String msg = saySomething("is this upper case?");
		System.out.println(msg + " it is now");

		int		firstInt  = 54;
		int		secondInt = 42;
		//	the addTwoNumbers will take two parameters and return the result of the method and assign that result to theSum
		int 	theSum = addTwoNumbers(firstInt, secondInt);
		System.out.println("this is the sum of " + firstInt + " and " + secondInt + " = " + theSum);

		//	here we do the very same operation but this time around we will not save the result we will just use it directly in the println
		System.out.println("this is the sum of " + firstInt + " and " + secondInt + " = " + addTwoNumbers(firstInt, secondInt));

		String msg1, msg2;
		msg1 = combineStrings("1 string", " 2 strings");
		msg2 = combineStrings(" Red strings", " Blue strings");
		msg = combineStrings(msg1, msg2);
		saySomething(msg);

		saySomething(combineStrings( combineStrings("One string", " Two strings"),
				                     combineStrings(" Red strings", " Blue strings")));

		msg = combineStrings("This is half of a message", " This is the other half");
		saySomething(msg);

		//	TODO add code here to print the output of the my100thBirth method
		//msg = my100thBirth("My Name", 33, 1922); // ------ here you need to add your parameters to
		saySomething(msg);

		// here is an array with some numbers to sum
		int[] smallArray = {1, 2, 3, 4};
		System.out.println("The sum of the small array is " + sumArray(smallArray));
		System.out.println("The average of the small array is " + averageArray(smallArray));

		//	here is a slightly bigger array
		int[] biggerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		int sumBig = sumArray(biggerArray);
		System.out.println("The sum of the big array is " + sumBig);
		System.out.println("The average of the big array is " + averageArray(biggerArray));
	}
}
