package enums;

public class TestEnum {
	public enum SD_CLASSES { JAVA, C_SHARP, NODE, HTML, SQL}
	public enum NETWORKS {CW, CBS, PBS, PBS_KIDS, NBC, ABC, JAVA}

	public static void main(String[] args) {
		String thisIsMyClass = "Java";
		int classNumber = 103;
		SD_CLASSES myClass;
		NETWORKS station = NETWORKS.CW;

		myClass 						= SD_CLASSES.JAVA;
		NETWORKS theProgrammingChannel 	= NETWORKS.JAVA;
		System.out.println("myClass = " + myClass);
		System.out.println("station = " + station);
	}
}
