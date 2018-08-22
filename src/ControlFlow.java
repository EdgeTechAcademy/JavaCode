import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Edge Tech Academy on 11/9/2016.
 */
public class ControlFlow {
	public static int getMonthNumber(String month) {

		int monthNumber = 0;

		if (month == null) {
			return monthNumber;
		}

		switch (month.toLowerCase().substring(0,3)) {
			case	"jan":	monthNumber = 1;		break;
			case	"feb":	monthNumber = 2;		break;
			case	"mar":	monthNumber = 3;		break;
			case	"apr":	monthNumber = 4;		break;
			case	"may":	monthNumber = 5;		break;
			case	"jun":	monthNumber = 6;		break;
			case	"jul":	monthNumber = 7;		break;
			case	"aug":	monthNumber = 8;		break;
			case	"sep":	monthNumber = 9;		break;
			case	"oct":	monthNumber = 10;		break;
			case	"nov":	monthNumber = 11;		break;
			case	"dec":	monthNumber = 12;       break;
			default:		monthNumber = 0;		break;
		}
		return monthNumber;
	}

	public static char getGrade(int testScore) {
		char grade;
		if (testScore >= 90) {
			grade = 'A';
		} else if (testScore >= 80) {
			grade = 'B';
		} else if (testScore >= 70) {
			grade = 'C';
		} else if (testScore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}

	public static String getMonthName(int monthNumber) {

		String monthString;

		switch (monthNumber) {
			case 1:				monthString = "January";			break;
			case 2:				monthString = "February";			break;
			case 3:				monthString = "March";				break;
			case 4:				monthString = "April";				break;
			case 5:				monthString = "May";				break;
			case 6:				monthString = "June";				break;
			case 7:				monthString = "July";				break;
			case 8:				monthString = "August";				break;
			case 9:				monthString = "September";			break;
			case 10:			monthString = "October";			break;
			case 11:			monthString = "November";			break;
			case 12:			monthString = "December";			break;
			default:			monthString = "Invalid month";		break;
		}
		return monthString;
	}

	public static int daysInMonth(int month, int year) {
		int numDays = 0;
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numDays = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				numDays = 30;
				break;
			case 2:
				if (((year % 4 == 0) &&
					!(year % 100 == 0))
				  || (year % 400 == 0))
					numDays = 29;
				else
					numDays = 28;
				break;
			default:
				System.out.println("Invalid month.");
				break;
		}
		return  numDays;
	}

	public static ArrayList<String> getFutureMonths(int month) {

		ArrayList<String> futureMonths = new ArrayList<>();

		switch (month) {
			case 1:  futureMonths.add("January");
			case 2:  futureMonths.add("February");
			case 3:  futureMonths.add("March");
			case 4:  futureMonths.add("April");
			case 5:  futureMonths.add("May");
			case 6:  futureMonths.add("June");
			case 7:  futureMonths.add("July");
			case 8:  futureMonths.add("August");
			case 9:  futureMonths.add("September");
			case 10: futureMonths.add("October");
			case 11: futureMonths.add("November");
			case 12: futureMonths.add("December");
				break;
			default: break;
		}
		return futureMonths;
	}

	@SuppressWarnings("ConstantConditions")
	public static void main(String[] args) {

		int 		testScore, monthNum, year, numDays;
		String 		checkMonth;
		ArrayList<String> futureMonths;
		Utils utils = new Utils();

		while (true) {
			String what = utils.getInput(
					"\n1 name   2 num     3 grade\n" +
					  "4 days   5 future  7 exit\n>  ");
			switch (what.toLowerCase()) {
				case "1":
				case "name":
					monthNum = utils.getNumber("Enter month number: ");		//	ask user for a month number
					String monthString = ControlFlow.getMonthName(monthNum);	//	get the month name
					System.out.println(monthString);
					break;

				case "2":
				case "num":
					checkMonth = utils.getInput("Enter month name: ");			//	ask user for a month
					monthNum = ControlFlow.getMonthNumber(checkMonth);			//	get the month number
					if (monthNum == 0) {										//	if it is 0 we entered a bad month
						System.out.println("Invalid month");
					} else {
						System.out.println(checkMonth + " is the " + monthNum + " month");
					}
					break;

				case "3":
				case "grade":
					testScore = utils.getNumber("Enter score: ");				//	ask user for a test score
					char grade = ControlFlow.getGrade(testScore);				//	get the student grade
					System.out.println("Grade = " + grade);
					break;

				case "4":
				case "days":
					monthNum = utils.getNumber("Enter month number: ");		//	get the number of a month
					year = utils.getNumber("Enter year number: ");				//	get the year value
					numDays = ControlFlow.daysInMonth(monthNum, year);			//	determine the number of days in the month
					System.out.println("Number of Days = " + numDays);
					break;

				case "5":
				case "future":
					monthNum = utils.getNumber("Enter month number: ");		//	get the number of a month
					futureMonths = ControlFlow.getFutureMonths(monthNum);		//	return a list of months for the rest of the year

					if (futureMonths.isEmpty()) {								//	if the list is empthy a bad month was entered
						System.out.println("Invalid month number");
					} else {
						for (String monthName : futureMonths) {					//	loop through the list of months and print them out
							System.out.println(monthName);
						}
					}
					break;

				case "7"	:
				case "exit"	:
					return;
			}
		}
	}
}