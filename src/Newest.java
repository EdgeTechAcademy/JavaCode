import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Edge Tech Academy on 3/13/2018.
 */
public class Newest {

	public static void main(String[] args) {
//		String msg;
//		msg = sayHelloTo("Gary", 1954, "NY");
//		System.out.println(msg);
//		msg = sayHelloTo("Arianne", 1900, "TX");
//		System.out.println(msg);
//		msg = sayHelloTo("Victoria", 200, "HI");
//		System.out.println(msg);

		String name = "Edge Tech Academy";
		String middle;
		int space1 = name.indexOf(" ");
		if (space1 >= 0) {
			int space2 = name.indexOf(" ", space1 + 1);
			if (space2 >= 0) {
				middle = name.substring(space1 + 1, space2);
				System.out.println("middle = " + middle);
			}
		}

		String[] aName = name.split(" ");
		if (aName.length > 2) {
			middle = aName[1];
		}

		String lostStudent = "david";
		String[] students = {"able", "baker", "charlie", "david", "echo", "foxtrot"};
		for (String student : students) {
			System.out.println("student = " + student + " is this " + lostStudent );
		}

		name = "Gary Thomas James";
		aName = name.split(" ");
		String initials = "";
		for (String w : aName) {
			System.out.println("Word = " + w);
			initials += w.charAt(0);
		}
		System.out.println("initials = " + initials);

		String z1 = Arrays.stream(name.split(" ")).map(x -> x.charAt(0) + "").collect(Collectors.joining(""));
		String z2 = Stream.of(aName).map(s -> s.charAt(0) + "").collect(Collectors.joining(""));

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered List: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		float deliveryCost;

		deliveryCost = calcOrderCost(200, true, "Canada");
		System.out.println("deliveryCost = " + deliveryCost);
		deliveryCost = calcOrderCost(100, false, "Mexico");
		System.out.println("deliveryCost = " + deliveryCost);
		deliveryCost = calcOrderCost(50, true, "US");
		System.out.println("deliveryCost = " + deliveryCost);
		deliveryCost = calcOrderCost(600, false, "US");
		System.out.println("deliveryCost = " + deliveryCost);
		deliveryCost = calcOrderCost(100, false, "Canada");
		System.out.println("deliveryCost = " + deliveryCost);

		for (int i = 0; i < 6; i++) {
			String msg = whatsMyNumber(i);
			System.out.println(msg);
		}
	}


	static String sayHelloTo(String name, int yearOfBirth, String state) {
		String msg = "";

		if (state == "TX") {
			msg = "Hello!" + name + ",you will retire in " + (yearOfBirth + 66) + ".are you going to retire in " + state + "?";
		} else if (state.equalsIgnoreCase("hi")) {
			msg = "Aloha!" + name + ",you will retire in " + (yearOfBirth + 66) + ".are you going to retire in " + state + "?";
		} else if (state == "NY" || state == "Ny" || state == "ny") {
			msg = "Yo!" + name + ",you will retire in " + (yearOfBirth + 66) + ".are you going to retire in " + state + "?";
		} else {
			msg = "Hello!" + name + ",you will retire in " + (yearOfBirth + 66) + ".are you going to retire in " + state + "?";
		}
		return msg;
	}

	static float calcOrderCost(float orderValue, boolean saturdayDelivery, String destination) {
		float deliveryCost;
		if (destination.equals("US")) {
			deliveryCost = 20.0f;
		} else if (destination.equals("Mexico")) {
			deliveryCost = 32.0f;
		} else {      // Assume that the country is Canada
			deliveryCost = 25.0f;
		}

		//	do something. you have to change the deliveryCost
		if (orderValue > 100) {
			if (destination.equals("US")) {
				deliveryCost -= 5.0f;
			} else {        //	grouping CA and MX together because they both have a 7$ discount for big orders
				deliveryCost -= 7.0f;
			}
		}

		if (saturdayDelivery) {
			//	change deliveryCost depending on Saturday deliver or not
			if (destination.equals("US")) {
				deliveryCost += 10;
			} else if (destination.equals("Mexico")) {
				deliveryCost += 20;
			} else {                //	only delivering to 3 countries at this time so just assume CA is the remaining one
				deliveryCost += 12;
			}
		}
		return deliveryCost;
	}

	static float calcOrderCostSwitch2(float orderValue, boolean saturdayDelivery, String destination) {
		float deliveryCost;
		switch (destination) {
			case "US":
				deliveryCost = 20.0f;
				if (orderValue > 100) {
					deliveryCost -= 5.0f;
				}
				if (saturdayDelivery) {
					deliveryCost += 10;
				}
				break;
			case "Mexico":
				deliveryCost = 32.0f;
				if (orderValue > 100) {
					deliveryCost -= 7.0f;
				}
				if (saturdayDelivery) {
					deliveryCost += 20;
				}
				break;
			default:
				deliveryCost = 25.0f;
				if (orderValue > 100) {
					deliveryCost -= 7.0f;
				}
				if (saturdayDelivery) {
					deliveryCost += 12;
				}
		}
		return deliveryCost;
	}

		static float calcOrderCostSwitch(float orderValue, boolean saturdayDelivery, String destination) {
		float deliveryCost;
		switch (destination) {
			case "US": 			deliveryCost = 20.0f; break;
			case "Mexico": 		deliveryCost = 32.0f; break;
			default: 			deliveryCost = 25.0f; break;
		}

		//	do something. you have to change the deliveryCost
		if (orderValue > 100) {
			switch (destination) {
				case "US": 		deliveryCost -= 5.0f; break;
				//	grouping CA and MX together because they both have a 7$ discount for big orders
				default:        deliveryCost -= 7.0f; break;
			}
		}

		if (saturdayDelivery) {
			//	change deliveryCost depending on Saturday deliver or not
			switch (destination) {
				case "US": 		deliveryCost += 10;		break;
				case "Mexico":	deliveryCost += 20;		break;
				//	only delivering to 3 countries at this time so just assume CA is the remaining one
				default:		deliveryCost += 12;		break;
			}
		}
		return deliveryCost;
	}


	static String whatsMyNumber(int number) {
		String answer = "";

		if (number == 1)
			answer += "This number " + number + " is the loneliest number\n";
		if (number == 0)
			answer += "This number " + number + " is Zero\n";
		if (number == 4)
			answer += "This number " + number + " is a perfect square\n";
		if (number == 2 || number == 3 || number == 5)
			answer += "This number " + number + " is prime\n";
		if (number == 2 || number == 4)
			answer += "This number " + number + " is even\n";
		if (number == 5 || number == 10)
			answer += "This number " + number + " is divisible by 5\n";
		if (number == 7 || number == 343 || number == 137)
			answer += "This number " + number + " is a lucky number\n";

		return answer;
	}

	static String thisIsANewMethod(String param1, int param2) {
		return param1 + param2;
	}
}
