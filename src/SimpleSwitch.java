import jdk.jshell.execution.Util;

import java.util.Calendar;
import java.util.Date;

public class SimpleSwitch {
	public static void main(String[] args) {

		//	Here we will use a switch acting on an integer
		String msg = "";
		int number = Utils.getNumber("Type a number> ");
		switch (number) {
			case 1:
				msg = "This is one thing you can do with a switch";
				break;
			default:
				msg = "request not recognized";
		}

		// 	just output a message that came from the switch code
		System.out.println("The number typed was: " + number + " " + msg);


		//	now we will use a switch using a string.
		//	ask the user to enter an option then we will act on it
		Calendar date = Calendar.getInstance();
		String option = Utils.getInput("What is your command? ");
		switch (option) {
			case "hour":
				msg = "The current hour is: " + date.get(Calendar.HOUR_OF_DAY);
				break;
		}
		System.out.println("msg = " + msg);
	}
}
