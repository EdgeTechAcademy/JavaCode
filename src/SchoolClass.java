import java.util.ArrayList;

public class SchoolClass {
	private String subject;
	private String instructor;
	private int roomNumber;
	private int period;
	private ArrayList<String> students;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<String> students) {
		this.students = students;
	}

	public void addStudent(String student) {
		students.add(student);		//	add a student to the list
	}

	public SchoolClass(String subject, String instructor, int roomNumber, int period) {
		this.subject = subject;
		this.instructor = instructor;
		this.roomNumber = roomNumber;
		this.period = period;
		students = new ArrayList<>();			//	create the list for the students in the class
	}

	@Override
	public String toString() {
		return "SchoolClass{" +
				"subject='" + subject + '\'' +
				", instructor='" + instructor + '\'' +
				", roomNumber=" + roomNumber +
				", period=" + period +
				", students=" + students +
				'}';
	}

	//	this method will search for a name in the students attribute of the class
	public boolean findStudent(String student) {
		for (String s : students) {
			if (s.equalsIgnoreCase(student)) {
				return true;	//	we found the student!
			}
		}
		return false;		//	searched the entire list with no joy
	}

	public static void main(String[] args) {
		String subject    = Utils.getInput("Subject: ");
		String instructor = Utils.getInput("Instructor: ");		//	get instructor
		int roomNumber    = Utils.getNumber("Room #: ");		//	get period
		int period        = Utils.getNumber("Period: ");		//	get room number

		SchoolClass schoolClass  = new SchoolClass(subject, instructor, roomNumber, period);
		System.out.println("schoolClass = " + schoolClass);
		int numberOfStudentsInClass = Utils.getNumber("How many students in class: ");

		for (int i = 0; i < numberOfStudentsInClass; i++) {
			String name = Utils.getInput("Enter Student " + i + ": ");		//	get student name
			schoolClass.addStudent(name);
		}
		schoolClass.addStudent("Alice");
		schoolClass.addStudent("Bernice");
		schoolClass.addStudent("Charlie");
		schoolClass.addStudent("Deb");
		schoolClass.addStudent("Ethan");

		System.out.println("schoolClass = " + schoolClass);
		String name = Utils.getInput("Search for: ");
		boolean found = schoolClass.findStudent(name);
		System.out.println(name + (found ? ": was found" : ": was not found") );
	}
}
