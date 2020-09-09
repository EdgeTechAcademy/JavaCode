package enums;

public class TestEnum {
	public enum GENDER { MALE, FEMALE, UNKNOWN_AT_THIS_TIME, NO_DECLARATION}
	public enum SD_CLASS { JAVA, C_SHARP, NODE, HTML, SQL}
	public enum NETWORK  {CW, CBS, PBS, PBS_KIDS, NBC, ABC, JAVA}

	public static void main(String[] args) {
		GENDER gender = GENDER.MALE;
		String thisIsMyClass = "Java";
		thisIsMyClass = "java";
		thisIsMyClass = "SD103";
		int classNumber = 103;
		SD_CLASS myClass;
		NETWORK station = NETWORK.CW;
		String greeting;
		//	'M', 'F', 0 , 1, true, false, ' ', null, 'male, 'female'
		if (gender == GENDER.MALE) {
			greeting = "Good day sir!";
		} else {
			greeting = "Top o' the morning to you ma'am";
		}

		myClass 						= SD_CLASS.JAVA;
		NETWORK theProgrammingChannel 	= NETWORK.JAVA;
		System.out.println("myClass = " + myClass);
		System.out.println("station = " + station);
	}
}
