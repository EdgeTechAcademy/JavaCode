import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

//  https://gist.github.com/EdgeTechAcademy/2a06f67ca7029c5e57ca083a5ac9ed38
public class Utils {

    static Scanner sc = new Scanner((System.in));

    /**
     * getInput	-	Prompt the user to type something in the console window
     *
     * @param prompt String - The message telling the user what to enter
     * @return String - The users response
     */
    public static String getInput(String prompt) {
        String response;                    //	will hold the response from the user
        System.out.print(prompt);            //	hey user - give me some information
        response = sc.nextLine();            //	I will wait here until you type something
        return response;                    //	much thanks I will return this to the calling method
    }

    /**
     * getNumber		-	Prompt the user to respond with a number
     *
     * @param prompt String - The message telling the user what to enter
     * @return int - The users response converted to a number
     */
    public static int getNumber(String prompt) {
        int number = 0;                         //	will hold the numeric response from the user
        String response;                        //	the String user response that needs to be converted to a number
        do {                                    //	infinite do-while until the user enters a number
            response = getInput(prompt);        //	ask user for a response
            try {                               //	protect the code from dieing if we don't get a number from the user
                number = Integer.parseInt(response);    //	convert to a number
                break;                           //	Yay! The user gave us a valid number
            } catch (NumberFormatException e) {  //	bad news. We did not get a number
                System.out.println(response + " Is not a number");        //	warn the user and continue prompting
            }
        } while (true);                          //	stay in the loop until we get a number from the user
        return number;                           //	yes this could go after the parseInt, I like all methods to end at the bottom
    }

    /**
     * getNumber		-	Prompt the user to respond with a number
     *
     * @param prompt String - The message telling the user what to enter
     * @return int - The users response converted to a number
     */
    public static double getDouble(String prompt) {
        double number = 0;                            //	will hold the numeric response from the user
        String response;                        //	the String user response that needs to be converted to a number
        do {                                    //	infinite do-while until the user enters a number
            response = getInput(prompt);        //	ask user for a response
            try {                                //	protect the code from dieing if we don't get a number from the user
                number = Double.parseDouble(response);    //	convert to a number
                break;                            //	Yay! The user gave us a valid number
            } catch (NumberFormatException e) {            //	bad news. We did not get a number
                System.out.println(response + " Is not a number");        //	warn the user and continue prompting
            }
        } while (true);                            //	stay in the loop until we get a number from the user
        return number;                            //	yes this could go after the parseDouble, I like all methods to end at the bottom
    }

    /**
     * getNumber		-	Prompt the user to respond with a number less than or equal to max
     *
     * @param prompt String - The message telling the user what to enter
     * @param max    int - max number the user can enter
     * @return int - The users response converted to a number
     */
    public static int getNumber(String prompt, int max) {
        int number = 0;                            //	will hold the numeric response from the user
        do {                                    //	infinite do-while until the user enters a number
            number = getNumber(prompt);            //	ask user for a response
        } while (number < 0 || number > max);    //	stay at it until the user enters a proper number
        return number;                            //	yay, we have our number
    }

    /**
     * getIntArray
     * Create an integer array with 20-40 elements and fill it with random numbers between 0 and 100
     *
     * @return an int array of random numbers
     */
    public static int[] getIntArray() {
        int size = (int) (Math.random() * 20) + 20;
        int[] randomNumbers = new int[size];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
        }
        return randomNumbers;
    }

    /**
     * getStrArray
     * Create a String array with 10-30 elements and fill it with random Strings between A-Z, a-z, 0-9, ' '
     *
     * @return an int array of random numbers
     */
    public static String[] getStrArray() {
        int size = (int) (Math.random() * 20) + 10;
        String[] randomStrings = new String[size];
        for (int i = 0; i < randomStrings.length; i++) {
            randomStrings[i] = getRandomString();
        }
        return randomStrings;
    }

    /**
     * getRandomString
     * Create a random sized string between 10 and 70 characters long
     */
    public static String getRandomString() {
        String src = "abcde fghi jklmn o pqrs tu vwx yz0 12345 678 9AB CDE FGH IJK LMNOPQ RSTUV WXYZ ";
        String strOut = "";

        int size = (int) (Math.random() * 60) + 10;
        for (int i = 0; i < size; i++) {
            int z = (int) (Math.random() * src.length());
            if ( src.charAt(z) == ' ')      //  if the next character is a space
                strOut = strOut.trim();     //  trim the string to not allow double spaces
            strOut += src.charAt(z);
        }
        return strOut.trim();
    }

    public static String readFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args) {
        int[] intAr = getIntArray();
        String str = getRandomString();
        System.out.println("strAr = " + str);
        for ( int x : intAr) {
            if ( x % 2 == 0) {
                System.out.println("Even " + x);
            }
        }
    }

}
