/**
 * Created by Edge Tech Academy on 11/16/2016.
 */
public class LocalClassExample {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(String phoneNumber) {

        int numberLength = 10;

        class PhoneNumber {

            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber){
                // numberLength = 7;
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                formattedPhoneNumber = (currentNumber.length() == numberLength) ? currentNumber : null;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            public void printOriginalNumber() {
                System.out.println("Original number was " + phoneNumber);
            }
        }

        PhoneNumber myNumber = new PhoneNumber(phoneNumber);

        myNumber.printOriginalNumber();

        System.out.println("Number is " + ((myNumber.getNumber() == null) ? "invalid" : myNumber.getNumber()));
    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890");
        validatePhoneNumber("456-7890");

		char myChars[] = new char[] { '1', 't', '*', '.', ' ', '\'', 'A', '\t' };
		for ( int i = 0; i < myChars.length; i++) {
			System.out.print(" '" + myChars[i] + "' " );
			if ( Character.isAlphabetic(myChars[i]) )	System.out.print(" Alphabetic");
			if ( Character.isDigit(myChars[i]) )		System.out.print(" Digit");
			if ( Character.isLetter(myChars[i]) )		System.out.print(" Letter");
			if ( Character.isLowerCase(myChars[i]) )	System.out.print(" LowerCase");
			if ( Character.isUpperCase(myChars[i]) )	System.out.print(" UpperCase");
			if ( Character.isWhitespace(myChars[i]) )	System.out.print(" Whitespace");
			System.out.println();
		}
    }
}
